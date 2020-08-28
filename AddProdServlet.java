package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Dao.*;
import Dao.ProdDBManager;
import Model.Product;

/**
 *
 * @author giann 
 */
public class AddProdServlet extends HttpServlet {

    
                //posts info for registry, checks if correct format or already exists
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Validator validator = new Validator();
        String prodname = request.getParameter("prodname");
        String price = request.getParameter("price");
        String prodtype = request.getParameter("prodtype");
        String stock = request.getParameter("stock");
        DBPYManager pym = (ProdDBManager) session.getAttribute("pym");
        validator.clear(session);        
        
       if(!validator.validateProdname(prodname)) {
            session.setAttribute("nameErr", "Error: Product Name format is incorrect");
            request.getRequestDispatcher("addprod.jsp").include(request, response);
        } else if(!validator.validatePrice(price)) {
            session.setAttribute("priceErr", "Error: Product Price format is incorrect");
            request.getRequestDispatcher("addprod.jsp").include(request, response);
        }   else if(!validator.validateType(prodtype)) {
            session.setAttribute("typeErr", "Error: Product Type format is incorrect");
            request.getRequestDispatcher("addprod.jsp").include(request, response);
        } else if(!validator.validateStock(stock)) {
           session.setAttribute("stockErr", "Error: Stock format is incorrect");
         request.getRequestDispatcher("addprod.jsp").include(request, response);
       } else{
            Product exist = pym.findProduct(prodname, prodtype);
            if(exist != null) { session.setAttribute("existErr", "Product alrteady exist in the Database!");
            request.getRequestDispatcher("addprod.jsp").include(request, response);}
            {
                session.setAttribute("existErr", "Create Product details !");
                pym.addProduct(prodname, prodtype, price, stock);
                request.getRequestDispatcher("addprod.jsp").include(request, response);
            }
        }
        }
}
