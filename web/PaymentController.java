/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import beans.*;
import dao.*;

/**
 *
 * @author zinha
 */
public class PaymentController extends HttpServlet {

   
//
//            connector = new DBConnector();
//            paymentDAO = new DBPayment(connector.openConnection());
//        }

        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
        /**
         * Handles the HTTP <code>GET</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
        }

        /**
         * Handles the HTTP <code>POST</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            HttpSession session = request.getSession();
                    DBPayment paymentManger = (DBPayment) session.getAttribute("DBPayment");

            int paymentId = Integer.parseInt(request.getParameter("paymentId"));
            String paymentType = request.getParameter("paymentType");
            String paymentDate = request.getParameter("paymentDate");
            int cardNo = Integer.parseInt(request.getParameter("cardNo"));
            String cardExpiryDate = request.getParameter("cardExpiryDate");
            int orderId = Integer.parseInt(request.getParameter("orderId"));
            int cvv = Integer.parseInt(request.getParameter("cvv"));
            String paymentStatus = request.getParameter("paymentStatus");

     
           try{
                paymentManger.addPayment(paymentId, paymentType, paymentDate, cardNo, cardExpiryDate, orderId, cvv, paymentStatus);
               getServletContext().getRequestDispatcher("/Payment.jsp").include(request, response);
//                                request.getRequestDispatcher("confirmation.jsp").include(request, response);      

           } catch (SQLException e){
               throw new ServletException("Cannot add payment method to database", e); 
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
//        @Override
//        public String getServletInfo() {
//            return "Short description";
//        }// </editor-fold>

    }
}
