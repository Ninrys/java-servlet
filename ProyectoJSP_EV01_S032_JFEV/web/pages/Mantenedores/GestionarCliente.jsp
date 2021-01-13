<%-- 
    Document   : GestionarCliente
    Created on : 08-05-2020, 22:16:24
    Author     : Ninry
--%>
<%@page import="cl.dto.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar Clientes</title>
        <style>
             form{
                margin: 0 auto;
                width: 600px;
                padding: 1em;
                border: 4px solid #CCC;
                border-radius: 1em
             }
            label{
                display: inline-block;
                text-align: right;
                width: 200px;
                 
            }
             ul{
                list-style: none;
                padding: 0;
            }
            input,
            textarea{
                width: 150px;
                box-sizing: border-box;
                border: 1px solid;
            }
             form li + li {
             margin-top: 1em;
            }
      
           
            
        </style>
    </head>
    <body>
         <%@include file="/pages/configuracion/cabecera.jsp" %> 
        <h1 align="center" > Gestionar Clientes</h1>
        <form action="/ProyectoJSP_EV01_S032_JFEV/GestionarClientes" method="post">
       <ul>
                <li><label for="rut">RUT: </label>
                    <input type="text" id="rut" name="rut" required>  
                </li>  
                <li>
                    <label for="nameCli">Nombre:</label>
                    <input type="text" id="nameCli" name="nameCli">
                </li>
                <li>
                    <label for="userMail" >Email: </label>
                    <input type="email" id="userMail" name="userMail">
               </li>  
               <li>
                   <label for="pais" >País: </label>
                    <select id="pais" name="pais">
                    
                        <option value="chile"> Chile</option>
                        <option value= "japon"> Japón</option>
                        <option value="india"> India</option>  
                    </select>
                   
               </li>
               <li> <label for="obser">Observaciones del Contacto</label>
                   <textarea id="obser" name="obser" ></textarea>
                   
               </li>
       
       
                <li>
                    
                    <button type="submit"> agregar </button>
                    <button type="reset"> Limpiar Formulario </button>
                     <input type="button" onclick="location.href='/ProyectoJSP_EV01_S032_JFEV/home.jsp';" value="Volver" />
                      
                    
                </li>
               
            </ul>
            </form>
        <h1>Listado de Clientes</h1>
        
         <% 
             
             ArrayList lista= (ArrayList)session.getAttribute("lista");
             if(lista!=null){
                 out.print(" <table align='center' border='2'><tr class='c1'><td class='c2'>Nombre</td> <td>e-mail</td><td>Pais</td></tr>" );
           for (int i = 0; i <lista.size(); i++) {
                Cliente cli= (Cliente)lista.get(i);
                   out.println("<tr>"); 
                
                        out.println("<td>"+cli.getNombre()+"</td>");
                        out.println("<td>"+cli.getEmail()+"</td>");
                        out.println("<td>"+cli.getPais()+"</td>");
                    
                out.println("</tr>");
                }

                out.println("</table>");
             }       
          %>
               
               
       
       
       
        <%@include file="../configuracion/piedepagina.jsp" %>  
    </body>
</html>
