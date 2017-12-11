package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Model.SanPham;

public final class ShowProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <font color=\"red\">Welcome, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</font>\n");
      out.write("        <h1>Show Result</h1>\n");
      out.write("        <form action=\"\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Ten San Pham</th>\n");
      out.write("                    <th>Gia moi</th>\n");
      out.write("                    <th>Gia Cu</th>\n");
      out.write("                    <th>Image</th>\n");
      out.write("                    <th>Mota</th>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");

                    SanPham sp = new SanPham();
                    List<SanPham> ds = sp.showProduct();
                    for (int i = 0; i < ds.size(); i++) {

                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( ds.get(i).getId());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( ds.get(i).getTensp());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( ds.get(i).getGiamoi());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( ds.get(i).getGiacu());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( ds.get(i).getImage());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( ds.get(i).getMota());
      out.write("</td>\n");
      out.write("                    <td><a href=\"Controller?btnAction=Delete\">Insert</a></td>\n");
      out.write("                    <td><a href=\"Controller?btnAction=Delete\">Delete</a></td>\n");
      out.write("                    <td><a href=\"ControllerAdmin?btnAction=Update&value=");
      out.print( ds.get(i).getId());
      out.write("\">Update</a></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
