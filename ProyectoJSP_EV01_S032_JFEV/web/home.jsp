<%--
    Document   : home
    Created on : 08-05-2020, 22:23:52
    Author     : Ninry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
       
    </head>
    <body>
        <%-- <jsp:include page= "pages/configuracion/cabecera.jsp"></jsp:include> --%>
      <%@include file="pages/configuracion/cabecera.jsp" %> 
      <br>
      <h1 align="center"> Menú de Opciones</h1>
      <br>
      <table align="center" border="1" style="width:22% "  >
          <tr><td>Gestionar Proveedores</td>
              <td>:</td>
              <td><a href="/ProyectoJSP_EV01_S032_JFEV/GestionarProveedores"><img src= "/ProyectoJSP_EV01_S032_JFEV/img/frutas/Durazno.jpg" alt="ProovedorDurazno" style="width:20px;height:20px;" ></a></td>
          </tr>
          <tr><td>Gestionar Clientes</td>
              <td>:</td>
              <td><a href="/ProyectoJSP_EV01_S032_JFEV/GestionarClientes"><img src= "/ProyectoJSP_EV01_S032_JFEV/img/frutas/Frambuesa.jpg" alt="ClienteFrambu" style="width:20px;height:20px;" ></a></td>
          </tr>
          <tr>
              <td>Gestionar Ventas </td>
              <td>:</td>
              <td><a href="/ProyectoJSP_EV01_S032_JFEV/GestionVentas"><img src= "/ProyectoJSP_EV01_S032_JFEV/img/frutas/Lichi.jpg" alt="VentasLichi" style="width:20px;height:20px;" ></a></td>
          </tr>
      </table>
        
        <%@include file="pages/configuracion/piedepagina.jsp" %>  
    </body>
</html>
