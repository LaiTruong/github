<%-- 
    Document   : showUser
    Created on : Jul 3, 2017, 1:17:44 PM
    Author     : Admin
--%>


<%@page import="java.util.List"%>
<%@page import="Model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show User Page</title>
    </head>
    <body>
        <font color="red">Welcome, ${sessionScope.USER}</font>
        <h1>Show Result</h1>
        <form action="" method="post">
            <table>
                <tr>
                    <th>Username</th>
                    <th>password</th>
                    <th>Roles</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>

                </tr>
                <%
                    User us = new User();
                    List<User> ds = us.showdata();
                    for (int i = 0; i < ds.size(); i++) {

                %>
                <tr>
                    <td><%= ds.get(i).getUsername()%></td>
                    <td><%= ds.get(i).getPassword()%></td>
                    <td><%= ds.get(i).isRoles()%></td>
                    <td><%= ds.get(i).getFirtname()%></td>
                    <td><%= ds.get(i).getLastname()%></td>
                    <td><%= ds.get(i).getEmail()%></td>
                    <td><a href="Controller?btnAction=Delete">Delete</a></td>
                    <td><a href="Controller?btnAction=Update&value=<%= ds.get(i).getUsername()%>">Update</a></td>

                </tr>
                <%
                    }
                %>
            </table>
        </form>
    </body>
</html>
