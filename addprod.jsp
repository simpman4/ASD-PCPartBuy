<%-- 
    Document   : addprod
    Created on : 20/08/2020, 9:39:02 AM
    Author     : giann
--%>
<%@page import="Model.Admin"%>
<%@page import="Model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Product Page</title>
    </head>
    <body onload="startTime(); resetSearch();">
        <div><span class="time" id="time" ></span></div>
        
        <%
            String existErr = (String) session.getAttribute("existErr");
            String prodtypeErr = (String) session.getAttribute("prodtypeErr");
            String prodpriceErr = (String) session.getAttribute("prodpriceErr");
            String prodstockErr = (String) session.getAttribute("prodstockErr");
            String nameErr = (String) session.getAttribute("nameErr");
            
            String prodName=request.getParameter("prodName");
            String prodType=request.getParameter("prodType");
            String price=request.getParameter("price");
            String stock=request.getParameter("stock");
        
            Admin admin = (Admin)session.getAttribute("admin");
        %>
           
     
        <form action="AddProdServlet" method="post"></form>
        <table id="form_table" border="1">
            <tr><td>Product Name:<input type="text" placeholder="<%=(nameErr != null ? nameErr : "Enter Product Name")%>" name="prodname"></td></tr>
            <tr><td>Product Type:<input type="text" placeholder="<%=(prodtypeErr != null ? prodtypeErr : "Enter Product Type")%>" name="prodtype"></td></tr>
            <tr><td>Price:<input type="text" placeholder="<%=(prodpriceErr != null ? prodpriceErr : "Enter Product Price")%>" name="prodprice"></td></tr>
            <tr><td>Stock:<input type="text" placeholder="<%=(prodstockErr != null ? prodstockErr : "Enter Stock Amount")%>" name="prodstock"></td></tr>
        </table>  
          

            <div>
                <a class="button" href="product.jsp" >Inventory</a>
                <a class="button" href="editprod.jsp">Edit</a>
                <a class="button" href="deleteprod.jsp" >Delete</a>
            </div>
    </body>
</html>
