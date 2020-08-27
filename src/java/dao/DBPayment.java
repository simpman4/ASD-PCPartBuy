/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Payment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;


/**
 *
 * @author zinha
 */
public class DBPayment {
    private Statement st;
    private Connection conn;
    
public DBPayment(Connection conn) throws SQLException {
        st = conn.createStatement();
        this.conn = conn;
    }
//retrieve all payment transactions
 public ArrayList<Payment> fetchAllPayments() throws SQLException {

        //setup the select sql query string  
        String fetch = "select * from root  .PAYMENT";
        //execute this query using the statement field      
        ResultSet rs = st.executeQuery(fetch);
        // define arrayList for the results of the search
        ArrayList<Payment> paymentsList = new ArrayList();
        while (rs.next()) {
            int paymentid = rs.getInt(1);
            String paymenttype = rs.getString(2);
            String paymentdate = rs.getString(3);
            int cardno = rs.getInt(4);
            
            
            String expirydate = rs.getString(5);
            int orderid = rs.getInt(6);
            int cvv = rs.getInt(7);
            String paymentstatus = rs.getString(8);
           


            //add the results to a ResultSet   
            paymentsList.add(new Payment(paymentid, paymenttype, paymentdate, cardno,expirydate,
                            orderid,cvv ,paymentstatus));
            
          
        } 
        return paymentsList;

    }
}
    
    