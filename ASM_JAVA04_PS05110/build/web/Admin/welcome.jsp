<%-- 
    Document   : welcome
    Created on : May 20, 2017, 2:39:52 PM
    Author     : PC01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body> 
        <font color ="red">  Welcome, ${sessionScope.USER}</font>
        <h1>Welcome to MVC Word</h1>
        <form action="Controller">
            Name <input type="text" name="txtSearch" value=""/><br/> <br/>
            <input type="submit" value="Search" name="btnAction"/>
        </form>
    </body>
</html>
