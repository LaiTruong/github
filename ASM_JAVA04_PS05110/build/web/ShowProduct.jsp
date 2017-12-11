<%-- 
    Document   : ShowProduct
    Created on : Jul 3, 2017, 7:36:43 PM
    Author     : Admin
--%>

<%@page import="java.util.List"%>
<%@page import="Model.SanPham"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <font color="red">Welcome, ${sessionScope.USER}</font>
        <h1>Show Result</h1>
        <form action="" method="post">
            <table>
                <tr>
                    <th>ID</th>
                    <th>Ten San Pham</th>
                    <th>Gia moi</th>
                    <th>Gia Cu</th>
                    <th>Image</th>
                    <th>Mota</th>

                </tr>
                <%
                    SanPham sp = new SanPham();
                    List<SanPham> ds = sp.showProduct();
                    for (int i = 0; i < ds.size(); i++) {

                %>
                <tr>
                    <td><%= ds.get(i).getId()%></td>
                    <td><%= ds.get(i).getTensp()%></td>
                    <td><%= ds.get(i).getGiamoi()%></td>
                    <td><%= ds.get(i).getGiacu()%></td>
                    <td><%= ds.get(i).getImage()%></td>
                    <td><%= ds.get(i).getMota()%></td>
                    <td><a href="Controller?btnAction=Delete">Insert</a></td>
                    <td><a href="Controller?btnAction=Delete">Delete</a></td>
                    <td><a href="ControllerAdmin?btnAction=Update&value=<%= ds.get(i).getId()%>">Update</a></td>

                </tr>
                <%
                    }
                %>
            </table>
        </form>
    </body>
</html>
