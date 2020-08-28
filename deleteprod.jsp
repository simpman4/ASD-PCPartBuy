<%-- 
    Document   : deleteprod
    Created on : 20/08/2020, 9:39:26 AM
    Author     : giann
--%>
<%@page import="Model.Admin"%>
<%@page import="Model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Product Page</title>
    </head>
    <body>
        <form action="DelProdServlet" method="post"></form>
        <%
            String prodName=request.getParameter("prodName");
            String prodType=request.getParameter("prodType");
            String price=request.getParameter("price");
            String stock=request.getParameter("stock");
        %>
            <div>
                <a class="button" href="addprod.jsp" >Add</a>
                <a class="button" href="editprod.jsp">Edit</a>
                <a class="button" href="product.jsp" >Inventory</a>
            </div>
        <h1>Hello World!</h1>
    </body>
</html>
