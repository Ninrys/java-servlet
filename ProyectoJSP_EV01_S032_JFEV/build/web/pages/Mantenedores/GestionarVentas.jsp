<%-- 
    Document   : GestionarVentas
    Created on : 08-05-2020, 22:17:59
    Author     : Ninry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar Ventas</title>
        <style>
            h1{
                text-align: center;
            }
            form{
                align-self: center;
            }
        </style>
        
            
    </head>
    
    <body>
    
         <%@include file="/pages/configuracion/cabecera.jsp"%>
        <h1>Gestionar Ventas</h1>
        
        <form action="/ProyectoJSP_EV01_S032_JFEV/GestionVentas" method="Post">
            <table border="1" align="center" style=" background-color: gainsboro; width: 70%;" >
                <tr>
                    <td> <input type="checkbox" name="frut0"> </td>
                    <td> Durazno</td>
                    <td> : </td>
                    <td> <img src="/ProyectoJSP_EV01_S032_JFEV/img/frutas/Durazno.jpg" alt="peach" style="width:30px;height:30px;" > </td>
                    <td>  <input type="number" name="cant0" min="1" > KG</td>
                </tr>
                <tr>
                <td> <input type="checkbox" name="frut1"> </td>
                    <td> Frambuesa</td>
                    <td> :</td>
                    <td> <img src="/ProyectoJSP_EV01_S032_JFEV/img/frutas/Frambuesa.jpg" alt="frambu" style="width:30px;height:30px;" > </td>
                    <td>  <input type="number" name="cant1" min="1"> KG</td> 
                
            </tr>
             <tr>
                    <td> <input type="checkbox" name="frut2"> </td>
                    <td> Frutilla</td>
                    <td> :</td>
                    <td> <img src="/ProyectoJSP_EV01_S032_JFEV/img/frutas/Frutilla.jpg" alt="fruti" style="width:30px;height:30px;" > </td>
                    <td>  <input type="number" name="cant2" min="1"> KG</td>
                </tr>
             <tr>
                    <td> <input type="checkbox" name="frut3"> </td>
                    <td> Lichi</td>
                    <td> :</td>
                    <td> <img src="/ProyectoJSP_EV01_S032_JFEV/img/frutas/Lichi.jpg" alt="lichi" style="width:30px;height:30px;" > </td>
                    <td>  <input type="number" name="cant3" min="1"> KG</td>
                </tr>
             <tr>
                    <td> <input type="checkbox" name="frut4"> </td>
                    <td> Mango</td>
                    <td> :</td>
                    <td> <img src="/ProyectoJSP_EV01_S032_JFEV/img/frutas/Mango.jpg" alt="mango" style="width:30px;height:30px;" > </td>
                    <td>  <input type="number" name="cant4" min="1"> KG</td>
                </tr>
             <tr>
                    <td> <input type="checkbox" name="frut5"> </td>
                    <td> Manzana</td>
                    <td> :</td>
                    <td> <img src="/ProyectoJSP_EV01_S032_JFEV/img/frutas/Manzana.jpg" alt="peach" style="width:30px;height:30px;" > </td>
                    <td>  <input type="number" name="cant5" min="1"> KG</td>
                </tr>
             <tr>
                    <td> <input type="checkbox" name="frut6"> </td>
                    <td> Mora</td>
                    <td> :</td>
                    <td> <img src="/ProyectoJSP_EV01_S032_JFEV/img/frutas/Mora.jpg" alt="mora" style="width:30px;height:30px;" > </td>
                    <td>  <input type="number" name="cant6" min="1"> KG</td>
                </tr>
              <tr>
                    <td> <input type="checkbox" name="frut7"> </td>
                    <td> Naranja</td>
                    <td> :</td>
                    <td> <img src="/ProyectoJSP_EV01_S032_JFEV/img/frutas/Naranja.jpg" alt="naranja" style="width:30px;height:30px;" > </td>
                    <td>  <input type="number" name="cant7" min="1" step="0.5"> KG</td>
                </tr>
              <tr>
                    <td> <input type="checkbox" name="frut8"> </td>
                    <td> Uva</td>
                    <td> :</td>
                    <td> <img src="/ProyectoJSP_EV01_S032_JFEV/img/frutas/Uva.jpg" alt="uva" style="width:30px;height:30px;" > </td>
                    <td>  <input type="number" name="cant8" min="1"> KG</td>
                </tr>
              <tr>
                    <td> <input type="checkbox" name="frut9"> </td>
                    <td> Plátano</td>
                    <td> :</td>
                    <td> <img src="/ProyectoJSP_EV01_S032_JFEV/img/frutas/platano.jpg" alt="platano" style="width:30px;height:30px;" > </td>
                    <td>  <input type="number" name="cant9" min="1"> KG</td>
                </tr>   
                
                
            </table>
            
            <button type="submit"> Calcular Total </button>
                    <button type="reset"> Limpiar Formulario </button>
                     <input type="button" onclick="location.href='/ProyectoJSP_EV01_S032_JFEV/home.jsp';" value="Volver" />
                     
        </form>
        <%
            String result  = (String)request.getAttribute("resultado");
            if(result!=null){
            
        
        out.print(String.format("<h1> El total es: " + result + " pesos</h1>"));
            }
        %>
        
        
        
      <%@include file="../configuracion/piedepagina.jsp" %>    
    </body>

