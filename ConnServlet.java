package controller;


import Dao.DBConnector;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Dao.*;
/**
 *
 * @author giann
 */
public class ConnServlet extends HttpServlet {
    
    private DBConnector db;
    private DBManager manager;
    private Connection conn;
    private ProdDBManager pym;
    
    @Override       //initialise connections
    public void init(){
        try{
            db = new DBConnector();
        } catch(ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override   // get session and open connections to managers
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        conn = db.openConnection();
        try {
            manager = new DBManager(conn);
            manager = new DBPYManager(conn);
            pym = new ProdDBManager(conn);
        } catch (SQLException ex) {
            Logger.getLogger(ConnServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        session.setAttribute("manager", manager);
    }
    
    @Override   //end connection and session 
    public void destroy(){
        try {
            db.closeConnection();
        } catch (SQLException ex){
            Logger.getLogger(ConnServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
