<%@page import="beans.Payment"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Payment Page</title>
    </head>
    <body>
        <h1>Make Payments</h1>
        <form action="PaymentController" method="POST">
            <table>
                    <tr>
                    <th>Payment Id</th>
                    <td>
                       <input type="text" name="paymentId" value="">
                    </td>
                </tr>
                <tr>
                    <th>Payment Type</th>
                    <td>
                        <select name="method">
                            <option>Direct Deposit</option>
                            <option>Credit Card</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th>Payment Date</th>
                    <td>
                        <input type="date" name="paymentDtae"  >
                    </td>
                </tr>
                <tr>
                    <th>Card Number</th>
                    <td>
                        <input type="text" name="cardNo"  >
                    </td>
                </tr>
                <tr>
                    <th>Card Expiry Date</th>
                    <td>
                        <input type="date" name="cardExpiryDate"  >
                    </td>
                </tr>
                <tr>
                    <th>Card Number</th>
                    <td>
                        <input type="text" name="cardNo">
                    </td>
                </tr>
                <tr>
                    <th>Order Number</th>
                    <td>
                        <input type="text" name="orderId">
                    </td>
                </tr>
                <tr>
                    <th>CVV</th>
                    <td>
                        <input type="text" name="cvv">
                    </td>
                </tr>
                <tr>
                    <th>Payment Status</th>
                    <td>
                        <input type="text" name="paymentStatus" value="Not Conformed">
                    </td>
                </tr>
            </table>
            <button type="submit">Pay</button>
           <!--<a href="payment.jsp" type="submit" class="botton" > Pay</a>-->

        </form>
    </body>
</html>
