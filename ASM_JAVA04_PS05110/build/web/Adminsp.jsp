<%-- 
    Document   : Adminsp
    Created on : Jun 30, 2017, 5:44:54 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="ControllerAdmin" methor="post" style="width: 300px">
            <p>ID  :<input type="text" name="txtId" value="" style="float: right"/></p>
            <p>Ten San Pham  :<input type="text" name="txtTensp" value="" style="float: right"/></p>
            <p>Gia Moi   :<input type="text" name="txtGiamoi" value="" style="float: right"/></p>
            <p>Gia cu  :<input type="text" name="txtGiacu" value="" style="float: right"/></p>
            <p>URL Image  :<input type="text" name="txtImage" value="" style="float: right"/></p>
            <p>Mo Ta  :<input type="text" name="txtMota" value="" style="float: right"/></p>

            <input type="submit" value="Upload" name="btnAction" />
            <input type="submit" value="Delete" name="btnAction" />
            <input type="submit" value="Home" name="btnAction" />
        </form>  
    </body>
</html>
