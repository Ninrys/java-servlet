<%-- 
    Document   : paginaPrincipal
    Created on : 08-05-2020, 22:25:54
    Author     : Ninry
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página principal 7u7</title>
        <style>
         
            
            form{
                margin: 0 auto;
                width: 400px;
                padding: 1em;
                border: 1px solid #CCC;
                border-radius: 1em
                    
            }
            label{
                display: inline-block;
                text-align: right;
                width: 100px;
                 
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
            select{
                box-sizing: border-box;
            }
            div{
                height: 50px;
                 width: 100%;
                 background: graytext;
                 display: flex;
                flex-direction: column;
                justify-content: center;
                 text-align: center;
                }
        </style>
    </head>
    <body>
        <%@include file="pages/configuracion/cabecera.jsp" %> 
        <form action="Login" method="post">
            <fieldset>
             <legend align="right">Datos</legend>
            <ul>
                <li><label for="rut">RUT: </label>
                    <input required type="text" id="rut" name="rut">   
                </li>  
                <li>
                    <label for="pass">Contraseña:</label>
                    <input required type="password" id="pass" name="pass" >
                </li>
                <li>
                    <label for="perfil" >Perfil: </label>
                    <select id="perfil" name="perfil">
                    
                        <option value="Cliente"> Cliente</option>
                        <option value= "Admin"> Administrador</option>
                        <option value="Vendedor"> Vendedor</option>  
                    </select>
                    
                    
                </li>  
                <li>
                    
                    <button type="submit"   > login </button>
                    <button type="reset"> Limpiar Formulario </button>
                   
                     
                </li>
               
            </ul>
           

            </fieldset>

        </form>
        <div>
       <%
            String result  = (String)request.getAttribute("fail");
            if(result!=null){
            
        
        out.print(String.format("<h3> " + result +"</h3>"));
            }
        %>
        </div>
        <footer>
             <%@include file="pages/configuracion/piedepagina.jsp" %>  
        </footer>          
       
    </body>
</html>
