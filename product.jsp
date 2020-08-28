<%-- 
    Document   : product
    Created on : 17/08/2020, 2:51:17 PM
    Author     : giann
--%>
<%@page import="Model.Admin"%>
<%@page import="Model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Management Page</title>
    </head>
    <body onload="startTime(); resetSearch();">
        <div><span class="time" id="time" ></span></div>>

            <div>
                <a class="button" href="addprod.jsp" >Add</a>
                <a class="button" href="editprod.jsp">Edit</a>
                <a class="button" href="deleteprod.jsp" >Delete</a>
            </div>
        <h1>List of all Products</h1>
        <table id="form_table" border="1">
            
            <tr>
                <td>Product ID:</td><td>
                <td>Product Name:</td>
                <td>Product Type:</td>
                <td>Product Price:</td>
                <td>Product Stock:</td>
            </tr>
            <c:set var="i" value="1" /> 
            <c:forEach items="${list}" var="u"> 
            <tr>
                <td>Product ID:</td><td><input type="text" name="prid" value="${product.prid}"></td>
                <td>Product Name:</td><td><input type="text" name="name" value="${product.name}"></td>
                <td>Product Type:</td><td><input type="text" name="type" value="${product.type}"></td>
                <td>Product Price:</td><td><input type="text" name="price" value="${product.price}"></td>
                <td>Product Stock:</td><td><input type="text" name="stock" value="${product.stock}"></td>
            </tr>
            <c:set var="i" value="${i+1}" /> 
            </c:forEach>
        </table>   
    </body>
</html>
