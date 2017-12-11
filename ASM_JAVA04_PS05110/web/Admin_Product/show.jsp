<%-- 
    Document   : show
    Created on : Jun 23, 2017, 2:33:01 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Show </title>
    </head>
    <body>
        <font color="red">Welcome, ${sessionScope.USER}</font>
        <h1>Show Result</h1>
        <c:set var="info" value="${requestScope.INFO}"/>
        <c:if test="${not empty info}">
            <table border="1">
                <thead>
                    <tr>
                        <th>No.</th>
                        <th>Ma_SP</th>
                        <th>Ten_SP</th>
                        <th>Loại</th>
                        <th>Số Lượng</th>
                        <th>Date</th>
                        <th>Insert</th>
                        <th>Delete</th>
                        <th>Update</th>
                    </tr>
                </thead>
                <tbody>
                    <c:set var="count" value="0"/>
                    <c:forEach var="rows" items="${info}">
                    <form action="Controller">
                        <c:set var="count" value="${count +1}"/>
                        <tr>
                            <td>${count}.</td>
                            <td>${rows.ID_SP}
                                <input type="hidden" name="txtID" value="${rows.ID_SP}"/>
                            </td>
                            <td><input type="text" name="txtName" value="${rows.Ten}"/></td>
                            <td><input type="text" name="txtLoai" value="${rows.Loai}"/></td>
                            <td><input type="text" name="txtSL" value="${rows.SoLuong}"/></td>
                            <td><input type="text" name="txtDate" value="${rows.Date}"/></td>

                            <c:url var="delete" value="Controller">
                                <c:param name="btnAction" value="Delete"/>
                                <c:param name="username" value="${rows.IS_SP}"/>
                                <c:param name="txtSearch" value="${param.txtSearch}"/>
                            </c:url>
                            <td><a href="${delete}">Delete</a></td>
                            <td>
                                <input type="hidden" name="txtSearch" value="${param.txtSearch}"/>
                                <input type="submit" onclick="alert('Update thành công')" value="Update" name="btnAction"/>
                            </td>
                        </tr>
                    </form>
                </c:forEach>
            </tbody>
        </table>
    </c:if>
    <c:url var="back" value="Controller">
        <c:param name="btnAction" value="Back"/>
    </c:url>
    <a href="${back}">Quay trở về trang Search</a>
</body>
</html>
