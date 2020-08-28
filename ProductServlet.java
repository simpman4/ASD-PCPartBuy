package controller;

import Dao.ProdDBManager;
import Model.Product;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author giann
 */
@WebServlet(name = "ProductServlet", urlPatterns = {"/ProductServlet"})
public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           //get session
        HttpSession session = request.getSession();
        String name = request.getParameter("name");
        String prid = request.getParameter("prid");
        String stock = request.getParameter("stock");
        String price = request.getParameter("price");
        String type = request.getParameter("type");
        ProdDBManager pym = (ProdDBManager) session.getAttribute("pym");
        
        Product product = null;   
       
        
        try {
            product = pym.findProduct(name, type);
            if(product != null) {
                session.setAttribute("product", product);
                request.getRequestDispatcher("product.jsp").include(request, response);
            } else {
                session.setAttribute("existErr", "Product details do not exist in the Database!");
                request.getRequestDispatcher("product.jsp").include(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditProdServlet.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getErrorCode() + " and " + ex.getMessage());
        }
        request.getRequestDispatcher("product.jsp").include(request, response);
    }
}
