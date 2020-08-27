package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import dao.DBConnector;
import beans.Payment;
import java.util.List;
import dao.DBPayment;

public final class Payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <link rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("\n");
      out.write("        <title>Payment Page</title>\n");
      out.write("    </head>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!DOCTYPE html>\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("            <link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet'>\n");
      out.write("            <link href='https://fonts.googleapis.com/css?family=Open Sans' rel='stylesheet'>\n");
      out.write("            <title>My Payments</title>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("        <center><h1>My Payments</h1></center>\n");
      out.write("        <center>\n");
      out.write("            <form>\n");
      out.write("                <div>\n");
      out.write("                    Payment ID: <input type=\"text\" name=\"pid\">\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    From: <input type=\"date\" name=\"from\"> &nbsp;\n");
      out.write("                    To: <input type=\"date\" name=\"to\">\n");
      out.write("                    <button type=\"submit\">Search</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </center>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>PAYMENTID</th>\n");
      out.write("                <th>PAYMNET TYPE</th>\n");
      out.write("                <th>PAYMENT DATE</th>\n");
      out.write("                <th>Card Name</th>\n");
      out.write("                <th>EXPORY DATE</th>\n");
      out.write("                <th>OrderID</th>\n");
      out.write("                <th>CVV</th>\n");
      out.write("                <th>PAYMENT STATUS</th>\n");
      out.write("                <th></th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                DBConnector db = new DBConnector();
                Connection conn = db.openConnection();
                // create an instance of orderdbmanager to use the methods inside it 
                DBPayment manager = new DBPayment(conn);
                session.setAttribute("ORDERMANAGER", manager);

            
      out.write("\n");
      out.write("            ");
                for (Payment pay : manager.fetchAllPayments()) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( pay.getPaymentID());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( pay.getPaymentType());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( pay.getPaymentDate());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( pay.getCardNo());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( pay.getCardExpiryDate());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( pay.getOrderId());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( pay.getCvc());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( pay.getPaymentStatus());
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"DeletePayment?pid=");
      out.print( pay.getPaymentID());
      out.write("\">Delete</a>\n");
      out.write("                    <a href=\"UpdatePayment?pid=");
      out.print( pay.getPaymentID());
      out.write("\">Update</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <center>\n");
      out.write("            <button onclick=\"window.location.href = 'addPayment.jsp?orderId=00000001&amount=298.0'\">Add Payment</button>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
