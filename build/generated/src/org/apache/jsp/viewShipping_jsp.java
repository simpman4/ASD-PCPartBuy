package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class viewShipping_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/styles.css\">\n");
      out.write("        <title>View Shipping details</title>\n");
      out.write("        <style>\n");
      out.write("            td {\n");
      out.write("                padding: 15px;\n");
      out.write("                border: 1px solid #444444;\n");
      out.write("            }\n");
      out.write("            .button {\n");
      out.write("                background-color: #009bc9;\n");
      out.write("            }\n");
      out.write("            .button:hover {\n");
      out.write("                background-color: grey;\n");
      out.write("            }\n");
      out.write("            header {\n");
      out.write("                background-color: #009bc9;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        <header>\n");
      out.write("            <div style=\"position: absolute; top: 20px; left: 5px;\">\n");
      out.write("                <a class=\"button\" style=\"font-size: 17px;\" href=\"shippingMain.jsp\">< Back</a>\n");
      out.write("            </div>\n");
      out.write("            <h1>View All Shipping Details</h1>\n");
      out.write("            <div class=\"logout\" style=\"top: 20px; right: 5px\">\n");
      out.write("                <a class=\"button\" style=\"font-size: 17px;\" href=\"LogoutServlet\">Logout</a>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <table style=\"border-collapse: collapse; margin-top: 20px; margin-bottom: 20px; \">\n");
      out.write("            <tr style=\"background-color: grey; color: white; font-weight: bold;\">\n");
      out.write("                <td>Shipping ID</td>\n");
      out.write("                <td>Street</td>\n");
      out.write("                <td>Suburb</td>\n");
      out.write("                <td>State</td>\n");
      out.write("                <td>Postcode</td>\n");
      out.write("                <td>Shipping Method</td>\n");
      out.write("                <td>Date</td>\n");
      out.write("               \n");
      out.write("            </tr>\n");
      out.write("          \n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("             \n");
      out.write("            \n");
      out.write("        </table>\n");
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
