
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/demo.css">
        <script type="text/javascript" src="js/script.js"></script>
        <title>Home Page</title>
    </head>
    <body onload="startTime()">
        <div><span class="time" id="time"></span></div>
        <h1> Index Page</h1>
        <div>
            <a class="button" href="register.jsp"> Register </a>
            <a class="button" href="login.jsp"> Login </a>
            <a class="button" href="adminlogin.jsp"> Admin Login </a>
        </div>
    <jsp include page="/ConnServlet" flush="true"></jsp>
    </body>
</html>
