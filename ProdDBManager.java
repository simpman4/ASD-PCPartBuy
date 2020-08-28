
package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Model.Product;

public class ProdDBManager 
{
    private Statement st;
    
    public ProdDBManager(Connection conn) throws SQLException
    {
        st = conn.createStatement();
        
    }
    
    //READ
    public Product findProduct(String name, int prid) throws SQLException
    {
        String query = "SELECT * FROM ISDUSER.PRODUCTS WHERE NAME='" + name + "' OR PRID='" + prid + "'";
        
        ResultSet rs = st.executeQuery(query);
        while(rs.next())
        {
            String productName = rs.getString(1);
            int productPRID = rs.getInt(2);
            
            if(name.equals(productName) || prid==productPRID)
            {
                String productType = rs.getString(3);
                double productPrice = rs.getDouble(4);
                int productStock = rs.getInt(5);
                
                return new Product(productName, productPRID, productType, productPrice, productStock);
            }
            
        }
        return null;
    }
    //CREATE
    public void addProduct(String name, int prid, String type, double price, int stock) throws SQLException
    {
        String query = "INSERT INTO ISDUSER.PRODUCTS VALUES ('" + name + "','" + prid + "','" + type + "','" + price + "','" + stock + "')";
        System.out.println("*DEBUG-51* " + query);
        st.executeUpdate(query);
    }
    //CHECK
    public boolean checkProduct(String name, int prid) throws SQLException
    {
        String query = "SELECT * FROM ISDUSER.PRODUCTS WHERE NAME='" + name + "' OR PRID='" + prid + "'";
        ResultSet rs = st.executeQuery(query);
        while(rs.next())
        {
            String productName = rs.getString(1);
            int productPRID = rs.getInt(2);
            
            if(name.equals(productName) || prid==productPRID)
            {
                return true;
            }
        }
        return false;
    }
    
    //UPDATE
    public void updateProduct(String name, int prid, String type, double price, int stock) throws SQLException
    {
        String query = "UPDATE ISDUSER.PRODUCTS SET TYPE='" + type + "',PRICE='" + price + "',STOCK='" + stock + "'";
        System.out.println("*DEBUG-76* " + query);
        st.executeUpdate(query);
    }
    
    //DELETE
    public void deleteProduct(int prid) throws  SQLException
    {
        String query = "DELETE FROM IOTUSER>PRODUCTS WHERE ID='" + prid + "'";
        System.out.println("*DEBUG-51* " + query);
        st.executeUpdate(query);
    }
    //FETCH ALL
    public ArrayList<Product> fetchProducts() throws SQLException
    {
        String fetch = "SELECT * FROM ISDUSER.PRODUCTS";
        ResultSet rs = st.executeQuery(fetch);
        ArrayList<Product> products = new ArrayList();
        
        while(rs.next())
        {
            String name = rs.getString(1);
            int prid = rs.getInt(2);
            String type = rs.getString(3);
            double price = rs.getDouble(4);
            int stock = rs.getInt(5);
            products.add(new Product(name, prid, type, price, stock));
        }
        return products;
    }
}
