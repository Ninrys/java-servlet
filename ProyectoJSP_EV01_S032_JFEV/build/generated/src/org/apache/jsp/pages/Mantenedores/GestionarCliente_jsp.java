package org.apache.jsp.pages.Mantenedores;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cl.dto.Cliente;
import java.util.ArrayList;

public final class GestionarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/pages/configuracion/cabecera.jsp");
    _jspx_dependants.add("/pages/Mantenedores/../configuracion/piedepagina.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Gestionar Clientes</title>\n");
      out.write("        <style>\n");
      out.write("             form{\n");
      out.write("                margin: 0 auto;\n");
      out.write("                width: 600px;\n");
      out.write("                padding: 1em;\n");
      out.write("                border: 4px solid #CCC;\n");
      out.write("                border-radius: 1em\n");
      out.write("             }\n");
      out.write("            label{\n");
      out.write("                display: inline-block;\n");
      out.write("                text-align: right;\n");
      out.write("                width: 200px;\n");
      out.write("                 \n");
      out.write("            }\n");
      out.write("             ul{\n");
      out.write("                list-style: none;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("            input,\n");
      out.write("            textarea{\n");
      out.write("                width: 150px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                border: 1px solid;\n");
      out.write("            }\n");
      out.write("             form li + li {\n");
      out.write("             margin-top: 1em;\n");
      out.write("            }\n");
      out.write("      \n");
      out.write("           \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Plants & Fruits</title>\n");
      out.write("        <style> table#head { width: 100%;\n");
      out.write("                background-color: #ccff99\n");
      out.write("                        }</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <header class=\"header\">\n");
      out.write("        <table id=\"head\">\n");
      out.write("            <tr> <td colspan=\"2\">Plant & Fruits</td> </tr>\n");
      out.write("            \n");
      out.write("               \n");
      out.write("            <tr> <td rowspan=\"2\"><img src=\"/ProyectoJSP_EV01_S032_JFEV/img/logos/Logo.jfif\" alt=\"Plants & Fruits\" style=\"width:120px;height:120px;\"></td>\n");
      out.write("                <td> <p style=\"color:green;\">Usuario: ");
      out.print( (session.getAttribute("tipoUser")) );
      out.write(" </p> </td></tr>\n");
      out.write("            \n");
      out.write("            <tr><td><a href=\"/ProyectoJSP_EV01_S032_JFEV/Login\"> Cerrar Sesión </a>  </td>\n");
      out.write("                </tr>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("        </table>\n");
      out.write("        </header>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("        <h1 align=\"center\" > Gestionar Clientes</h1>\n");
      out.write("        <form action=\"/ProyectoJSP_EV01_S032_JFEV/GestionarClientes\" method=\"post\">\n");
      out.write("       <ul>\n");
      out.write("                <li><label for=\"rut\">RUT: </label>\n");
      out.write("                    <input type=\"text\" id=\"rut\" name=\"rut\" required>  \n");
      out.write("                </li>  \n");
      out.write("                <li>\n");
      out.write("                    <label for=\"nameCli\">Nombre:</label>\n");
      out.write("                    <input type=\"text\" id=\"nameCli\" name=\"nameCli\">\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <label for=\"userMail\" >Email: </label>\n");
      out.write("                    <input type=\"email\" id=\"userMail\" name=\"userMail\">\n");
      out.write("               </li>  \n");
      out.write("               <li>\n");
      out.write("                   <label for=\"pais\" >País: </label>\n");
      out.write("                    <select id=\"pais\" name=\"pais\">\n");
      out.write("                    \n");
      out.write("                        <option value=\"chile\"> Chile</option>\n");
      out.write("                        <option value= \"japon\"> Japón</option>\n");
      out.write("                        <option value=\"india\"> India</option>  \n");
      out.write("                    </select>\n");
      out.write("                   \n");
      out.write("               </li>\n");
      out.write("               <li> <label for=\"obser\">Observaciones del Contacto</label>\n");
      out.write("                   <textarea id=\"obser\" name=\"obser\" ></textarea>\n");
      out.write("                   \n");
      out.write("               </li>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("                <li>\n");
      out.write("                    \n");
      out.write("                    <button type=\"submit\"> agregar </button>\n");
      out.write("                    <button type=\"reset\"> Limpiar Formulario </button>\n");
      out.write("                     <input type=\"button\" onclick=\"location.href='/ProyectoJSP_EV01_S032_JFEV/home.jsp';\" value=\"Volver\" />\n");
      out.write("                      \n");
      out.write("                    \n");
      out.write("                </li>\n");
      out.write("               \n");
      out.write("            </ul>\n");
      out.write("            </form>\n");
      out.write("        <h1>Listado de Clientes</h1>\n");
      out.write("        \n");
      out.write("         ");
 
             
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
          
      out.write("\n");
      out.write("               \n");
      out.write("               \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("      <head>\n");
      out.write("    \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Bot</title>\n");
      out.write("        <style> table#foot { width: 100%;\n");
      out.write("                 background-color: #afcec0;\n");
      out.write("                 \n");
      out.write("                 left: 0;\n");
      out.write("                 bottom: 0;\n");
      out.write("                 width: 100%;\n");
      out.write("           }\n");
      out.write("           td#redes, td#redes1{\n");
      out.write("               background-color: greenyellow\n");
      out.write("           }\n");
      out.write("        </style>    \n");
      out.write("      </head>      \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <table id=\"foot\" >\n");
      out.write("            <tr><td id=\"redes\" colspan=\"3\"  > Síguenos en nuestras redes sociales </td>\n");
      out.write("                <td id=\"redes1\">Contacto</td></tr>\n");
      out.write("            <tr>  <td>Facebook</td>\n");
      out.write("                <td>Instragram</td>\n");
      out.write("                <td>Twitter</td>\n");
      out.write("                <td> Whatsapp </td>\n");
      out.write("           \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td> <a href=\"https://www.facebook.com/\"> <img src=\"/ProyectoJSP_EV01_S032_JFEV/img/icon/facebook.jpg\" alt=\"Fb\" style=\"width:70px;height:70px;\" > </a></td>  \n");
      out.write("            <td> <a href=\" http://www.instagram.com/\"><img src=\"/ProyectoJSP_EV01_S032_JFEV/img/icon/instagram.png\" alt=\"Ig\" style=\"width:70px;height:70px;\"> </a> </td>  \n");
      out.write("            <td> <a href=\"https://www.twitter.com/\"> <img src=\"/ProyectoJSP_EV01_S032_JFEV/img/icon/twitter.png\" alt=\"Twitter\" style=\"width:70px;height:70px;\"> </a></td>  \n");
      out.write("            <td> <a href=\"https://wa.me/56971427545\"> <img src=\"/ProyectoJSP_EV01_S032_JFEV/img/icon/Whatsapp.png\" alt=\"Whatsapp\" style=\"width:70px;height:70px;\"> </a></td>  \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
