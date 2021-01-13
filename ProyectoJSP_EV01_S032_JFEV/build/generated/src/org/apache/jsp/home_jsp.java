package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/pages/configuracion/cabecera.jsp");
    _jspx_dependants.add("/pages/configuracion/piedepagina.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("      ");
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
      out.write("      <br>\n");
      out.write("      <h1 align=\"center\"> Menú de Opciones</h1>\n");
      out.write("      <br>\n");
      out.write("      <table align=\"center\" border=\"1\" style=\"width:22% \"  >\n");
      out.write("          <tr><td>Gestionar Proveedores</td>\n");
      out.write("              <td>:</td>\n");
      out.write("              <td><a href=\"/ProyectoJSP_EV01_S032_JFEV/GestionarProveedores\"><img src= \"/ProyectoJSP_EV01_S032_JFEV/img/frutas/Durazno.jpg\" alt=\"ProovedorDurazno\" style=\"width:20px;height:20px;\" ></a></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr><td>Gestionar Clientes</td>\n");
      out.write("              <td>:</td>\n");
      out.write("              <td><a href=\"/ProyectoJSP_EV01_S032_JFEV/GestionarClientes\"><img src= \"/ProyectoJSP_EV01_S032_JFEV/img/frutas/Frambuesa.jpg\" alt=\"ClienteFrambu\" style=\"width:20px;height:20px;\" ></a></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("              <td>Gestionar Ventas </td>\n");
      out.write("              <td>:</td>\n");
      out.write("              <td><a href=\"/ProyectoJSP_EV01_S032_JFEV/GestionVentas\"><img src= \"/ProyectoJSP_EV01_S032_JFEV/img/frutas/Lichi.jpg\" alt=\"VentasLichi\" style=\"width:20px;height:20px;\" ></a></td>\n");
      out.write("          </tr>\n");
      out.write("      </table>\n");
      out.write("        \n");
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
