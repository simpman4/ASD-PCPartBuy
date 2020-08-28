package controller;

import java.io.PrintWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Dao.ProdDBManager;
import Model.Product;
/**
 *
 * @author giann
 */
public class EditProdServlet extends HttpServlet {

     
    @Override           //posts information to update information in the database
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String name = request.getParameter("name");
        String prid = request.getParameter("prid");
        String stock = request.getParameter("stock");
        String price = request.getParameter("price");
        String type = request.getParameter("type");
        ProdDBManager pym = (ProdDBManager) session.getAttribute("pym");
        
        try {
            Product exist = pym.findProduct(name, type);
            if (exist!= null) {
                pym.updateProduct(name, prid, type, price, stock);
                session.setAttribute("u", "Update was Successful");
                request.getRequestDispatcher("editprod.jsp").include(request, response);
            } else {
                session.setAttribute("u", "Update Was Successful");
                request.getRequestDispatcher("editprod.jsp").include(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditProdServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect("editprod.jsp");
    }
    
   
}
