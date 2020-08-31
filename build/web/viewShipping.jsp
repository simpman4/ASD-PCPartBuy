<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/styles.css">
        <title>View Shipping details</title>
        <style>
            td {
                padding: 15px;
                border: 1px solid #444444;
            }
            .button {
                background-color: #009bc9;
            }
            .button:hover {
                background-color: grey;
            }
            header {
                background-color: #009bc9;
            }
        </style>
    </head>
    <body>
    
        <header>
            <div style="position: absolute; top: 20px; left: 5px;">
                <a class="button" style="font-size: 17px;" href="shippingMain.jsp">< Back</a>
            </div>
            <h1>View All Shipping Details</h1>
            <div class="logout" style="top: 20px; right: 5px">
                <a class="button" style="font-size: 17px;" href="LogoutServlet">Logout</a>
            </div>
        </header>
        
        <table style="border-collapse: collapse; margin-top: 20px; margin-bottom: 20px; ">
            <tr style="background-color: grey; color: white; font-weight: bold;">
                <td>Shipping ID</td>
                <td>Street</td>
                <td>Suburb</td>
                <td>State</td>
                <td>Postcode</td>
                <td>Shipping Method</td>
                <td>Date</td>
               
            </tr>
          
                    
                        
                    </tr>
             
            
        </table>
    </body>
</html>
