/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.SanPham;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "ControllerAdmin", urlPatterns = {"/ControllerAdmin"})
public class ControllerAdmin extends HttpServlet {

    final private String homePage = "index.jsp";
    final private String welcomePage = "welcome.jsp";
    final private String UpdatePage = "UpdateProduct.jsp";
    final private String showPage = "ShowProduct.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            String action = request.getParameter("btnAction");
            if (action.equals("Insert Product")) {
                String Id = request.getParameter("txtId");
                String Tensp = request.getParameter("txtTensp");
                String Giamoi = request.getParameter("txtGiamoi");
                String Giacu = request.getParameter("txtGiacu");
                String Image = request.getParameter("txtImage");
                String Mota = request.getParameter("txtMota");
                SanPham updatesp = new SanPham();
                boolean result = updatesp.insertsp(Id, Tensp, Giamoi, Giacu, Image, Mota);
                RequestDispatcher rd = request.getRequestDispatcher(homePage);
                rd.forward(request, response);
            } else if (action.equals("Update")) {
                String Id = request.getParameter("value");
                SanPham sp = new SanPham();
                SanPham ds = sp.showdata(Id);
                request.setAttribute("id", ds.getId());
                request.setAttribute("Tensp", ds.getTensp());
                request.setAttribute("Giamoi", ds.getGiamoi());
                request.setAttribute("Giacu", ds.getGiacu());
                request.setAttribute("Image", ds.getImage());
                request.setAttribute("Mota", ds.getMota());
                request.getRequestDispatcher("UpdateProduct.jsp").forward(request, response);
            } else if (action.equals("Update Product")) {
                String id = request.getParameter("txtId");
                String Tensp = request.getParameter("txtTensp");
                String Giamoi = request.getParameter("txtGiamoi");
                String Giacu = request.getParameter("txtGiacu");
                String image = request.getParameter("txtImage");
                String Mota = request.getParameter("txtMota");

                SanPham updateSp = new SanPham(id, Tensp, Giamoi, Giacu, image, Mota);
                boolean result = updateSp.updateProduct();
                request.getRequestDispatcher(showPage).forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
