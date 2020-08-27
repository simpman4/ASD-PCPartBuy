<%-- 
    Document   : Payment
    Created on : Aug 27, 2020, 6:23:14 PM
    Author     : zinha
--%>

<%@page import="java.sql.Connection"%>
<%@page import="dao.DBConnector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css"/>

        <title>Payment Page</title>
    </head>
    <%-- 
     Document   : myPayment
     Created on : 2020-6-1, 22:59:09
     Author     : caojingwen
    --%>

    <%@page import="beans.Payment"%>
    <%@page import="java.util.List"%>
    <%@page import="dao.DBPayment"%>

    <!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link rel="stylesheet" href="css/style.css"/>
            <link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet'>
            <link href='https://fonts.googleapis.com/css?family=Open Sans' rel='stylesheet'>
            <title>My Payments</title>
        </head>
        <body>
        <center><h1>My Payments</h1></center>
        <center>
            <form>
                <div>
                    Payment ID: <input type="text" name="pid">
                </div>
                <div>
                    From: <input type="date" name="from"> &nbsp;
                    To: <input type="date" name="to">
                    <button type="submit">Search</button>
                </div>
            </form>
        </center>
        <table>
            <tr>
                <th>PAYMENTID</th>
                <th>PAYMNET TYPE</th>
                <th>PAYMENT DATE</th>
                <th>Card Name</th>
                <th>EXPORY DATE</th>
                <th>OrderID</th>
                <th>CVV</th>
                <th>PAYMENT STATUS</th>
                <th></th>
            </tr>
            <%
                DBConnector db = new DBConnector();
                Connection conn = db.openConnection();
                // create an instance of orderdbmanager to use the methods inside it 
                DBPayment manager = new DBPayment(conn);
                session.setAttribute("ORDERMANAGER", manager);

            %>
            <%                for (Payment pay : manager.fetchAllPayments()) {
            %>
            <tr>
                <td><%= pay.getPaymentID()%></td>
                <td><%= pay.getPaymentType()%></td>
                <td><%= pay.getPaymentDate()%></td>
                <td><%= pay.getCardNo()%></td>
                <td><%= pay.getCardExpiryDate()%></td>
                <td><%= pay.getOrderId()%></td>
                <td><%= pay.getCvc()%></td>
                <td><%= pay.getPaymentStatus()%></td>
                <td>
                    <a href="DeletePayment?pid=<%= pay.getPaymentID()%>">Delete</a>
                    <a href="UpdatePayment?pid=<%= pay.getPaymentID()%>">Update</a>
                </td>
            </tr>
            <%
                }
            %>

        </table>
        <center>
            <button onclick="window.location.href = 'addPayment.jsp?orderId=00000001&amount=298.0'">Add Payment</button>
        </center>
    </body>
</html>

