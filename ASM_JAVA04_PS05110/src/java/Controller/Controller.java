/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.SanPham;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Model.User;

/**
 *
 * @author Admin
 */
public class Controller extends HttpServlet {

    final private String errorPage = "fail.jsp";
    final private String homePage = "index.jsp";
    final private String welcomePage = "welcome.jsp";
    final private String registerPage = "register.jsp";
    final private String showPage = "showUser.jsp";
    final private String LoginPage = "Login.jsp";

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
            String action = request.getParameter("btnAction");
            if (action.equals("Login")) {
                String username = request.getParameter("txtUsername");
                String password = request.getParameter("txtPass");

                User login = new User();
                boolean result = login.checkLogin(username, password);

                String url = errorPage;
                if (result) {
                    HttpSession session = request.getSession(true);
                    session.setAttribute("USER", username);
                    url = welcomePage;
                }

                RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request, response);

            } else if (action.equals("tryAgain")) {
                RequestDispatcher rd = request.getRequestDispatcher(LoginPage);
                rd.forward(request, response);
            } else if (action.equals("Creat new account")) {
                String username = request.getParameter("txtUser");
                String password = request.getParameter("txtPass");
                String admin = request.getParameter("ckAdmin");
                boolean roles = false;
                if (admin != null) {
                    roles = true;
                }
                String firtname = request.getParameter("txtfirstname");
                String lastname = request.getParameter("txtlastname");
                String email = request.getParameter("txtemail");
                String photo = request.getParameter("txtphoto");
                User login = new User();
                login.insert(username, password, roles, firtname, lastname, email, photo);
                RequestDispatcher rd = request.getRequestDispatcher(LoginPage);
                rd.forward(request, response);
            } else if (action.equals("Update")) {
                String username = request.getParameter("value");
                User us = new User();
                User ds = us.show(username);
                request.setAttribute("username", ds.getUsername());
                request.setAttribute("password", ds.getPassword());
                request.setAttribute("Roles", ds.isRoles());
                request.setAttribute("Firstname", ds.getFirtname());
                request.setAttribute("Lastname", ds.getLastname());
                request.setAttribute("Email", ds.getEmail());
//                out.println("<p>"+ds.isRoles()+"</p>");
                request.getRequestDispatcher("UpdateUser.jsp").forward(request, response);
            } else if (action.equals("Update account")) {
                String username = request.getParameter("txtUser");
                String password = request.getParameter("txtPass");
                String admin = request.getParameter("ckAdmin");
                boolean roles = false;
                if (admin != null) {
                    roles = true;
                }
                String firstname = request.getParameter("txtfirstname");
                String lastname = request.getParameter("txtlastname");
                String email = request.getParameter("txtemail");
                String image = request.getParameter("txtphoto");

                User updateUser = new User(username, password, roles, firstname, lastname, email, image);
                boolean result = updateUser.update();
                request.getRequestDispatcher(showPage).forward(request, response);
            } else if (action.equals("Delete")) {
                String username = request.getParameter("txtUser");
                User us = new User();
                us.setUsername(username);
                boolean result = us.deleteUser();
                request.getRequestDispatcher(LoginPage).forward(request, response);
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
