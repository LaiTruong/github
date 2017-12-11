package org.apache.jsp.Admin_005fProduct;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Login Page</h1>\n");
      out.write("        <form action=\"Controller\" method=\"post\">\n");
      out.write("            Username <input type=\"text\" name=\"txtUsername\" value=\"\"/><br/> <br/>\n");
      out.write("            Password <input type=\"password\" name=\"txtPass\" value=\"\"/><br/> <br/>\n");
      out.write("            <input type=\"submit\" value=\"Login\" name=\"btnAction\"/>\n");
      out.write("            <input type=\"reset\" value=\"Reset\"/>\n");
      out.write("        </form>\n");
      out.write("    </body><head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Login Page</h1>\n");
      out.write("        <form action=\"Controller\" method=\"post\">\n");
      out.write("            Username <input type=\"text\" name=\"txtUsername\" value=\"\"/><br/> <br/>\n");
      out.write("            Password <input type=\"password\" name=\"txtPass\" value=\"\"/><br/> <br/>\n");
      out.write("            <input type=\"submit\" value=\"Login\" name=\"btnAction\"/>\n");
      out.write("            <input type=\"reset\" value=\"Reset\"/>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Header End -->\n");
      out.write("<div id=\"maincontainer\">\n");
      out.write("  <section id=\"login\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <ul class=\"breadcrumb\">\n");
      out.write("        <li>\n");
      out.write("          <a href=\"#\">Home</a>\n");
      out.write("          <span class=\"divider\">/</span>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"active\">Login</li>\n");
      out.write("      </ul>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        \n");
      out.write("        <!-- Account Login-->\n");
      out.write("        <div class=\"span9\">\n");
      out.write("          <h1 class=\"headingmain\"><span>Account Login</span></h1>\n");
      out.write("          <section class=\"newcustomer\">\n");
      out.write("            <h2 class=\"heading2\">New Customer </h2>\n");
      out.write("            <div class=\"loginbox\">\n");
      out.write("              <h4 class=\"heading4\"> Register Account</h4>\n");
      out.write("              <p>By creating an account you will be able to shop faster, be up to date on an order's status, and keep track of the orders you have previously made.</p>\n");
      out.write("              <br>\n");
      out.write("              <p>By creating an account you will be able to shop faster, be up to date on an order's status, and keep track of the orders you have previously made.</p>\n");
      out.write("              <br>\n");
      out.write("              <br>\n");
      out.write("              <a href=\"inscription.jsp\" class=\"btn btn-success\">Continue</a>\n");
      out.write("            </div>\n");
      out.write("          </section>\n");
      out.write("          <section class=\"returncustomer\">\n");
      out.write("            <h2 class=\"heading2\">Returning Customer </h2>\n");
      out.write("            <div class=\"loginbox\">\n");
      out.write("              <h4 class=\"heading4\">I am a returning customer</h4>\n");
      out.write("              <form class=\"form-vertical\" action=\"login\" method=\"post\" >\n");
      out.write("                <fieldset>\n");
      out.write("                  <div class=\"control-group\">\n");
      out.write("                    <label  class=\"control-label\">Login:</label>\n");
      out.write("                    <div class=\"controls\">\n");
      out.write("                      <input type=\"text\" name=\"username\"  class=\"span3\">\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"control-group\">\n");
      out.write("                    <label  class=\"control-label\"  >Password:</label>\n");
      out.write("                    <div class=\"controls\">\n");
      out.write("                      <input type=\"password\" name=\"password\"  class=\"span3\">\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  \n");
      out.write("                  <br>\n");
      out.write("                  <br>\n");
      out.write("                  \n");
      out.write("                  <input class=\"btn btn-success\" type=\"submit\" value=\"Login\" >\n");
      out.write("                </fieldset>\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("          </section>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-- Sidebar Start-->\n");
      out.write("        <div class=\"span3\">\n");
      out.write("          <aside>\n");
      out.write("            <div class=\"sidewidt\">\n");
      out.write("              <h1 class=\"heading1\"><span>Account</span></h1>\n");
      out.write("              <ul class=\"nav nav-list categories\">\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"#\">Login / Register</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"#\">Forgotten Password</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"#\">My Account</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"#\">Wish List</a>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#\">Order History</a>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#\">Downloads</a>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#\">Returns</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"#\"> Transactions</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"category.html\">Newsletter</a>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </aside>\n");
      out.write("        </div>\n");
      out.write("        <!-- Sidebar End-->");
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
