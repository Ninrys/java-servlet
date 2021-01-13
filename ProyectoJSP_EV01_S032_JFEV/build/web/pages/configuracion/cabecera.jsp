<%-- 
    Document   : cabecera
    Created on : 08-05-2020, 22:04:21
    Author     : Ninry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Plants & Fruits</title>
        <style> table#head { width: 100%;
                background-color: #ccff99
                        }</style>
    </head>
    <body>
        
        <header class="header">
        <table id="head">
            <tr> <td colspan="2">Plant & Fruits</td> </tr>
            
               
            <tr> <td rowspan="2"><img src="/ProyectoJSP_EV01_S032_JFEV/img/logos/Logo.jfif" alt="Plants & Fruits" style="width:120px;height:120px;"></td>
                <td> <p style="color:green;">Usuario: <%= (session.getAttribute("tipoUser")) %> </p> </td></tr>
            
            <tr><td><a href="/ProyectoJSP_EV01_S032_JFEV/Login"> Cerrar Sesión </a>  </td>
                </tr>
            
           
        </table>
        </header>
    </body>
</html>
