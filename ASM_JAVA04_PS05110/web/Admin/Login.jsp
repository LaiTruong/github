
<%-- 
    Document   : index
    Created on : May 20, 2017, 1:47:28 PM
    Author     : PC01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login Page</h1>
        <form action="Controller" method="post">
            Username <input type="text" name="txtUsername" value=""/><br/> <br/>
            Password <input type="password" name="txtPass" value=""/><br/> <br/>
            <input type="submit" value="Login" name="btnAction"/>
            <input type="reset" value="Reset"/>
        </form>
    </body>
</html>
