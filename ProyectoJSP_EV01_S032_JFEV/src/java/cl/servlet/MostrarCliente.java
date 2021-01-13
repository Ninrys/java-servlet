/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ninry
 */
public class MostrarCliente extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MostrarCliente</title>");            
            out.println("</head>");
            out.println("<body>");
           // out.println("<h1>Servlet MostrarCliente at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link  href=\"css/style.css\"  type=text/css>");
            out.println("<title>Servlet MostrarCliente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3 align=center>Datos Informativos</h3>");            
            out.println("<table align=center border=2>");
            out.println("<tr>");
            out.println("<td>IP:");
            out.println("</td>");            
            out.println("<td>"+request.getLocalAddr()+"</td>");
            out.println("</tr>");
            out.println("<td>Puerto:");
            out.println("</td>");
            out.println("<td>"+request.getServerPort()+"</td>");
            out.println("</tr>");
            out.println("<td>Content Type:");
            out.println("</td>");
            out.println("<td>"+request.getContentType()+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td align=center colspan=3"+"><input type=\"button\" onclick=\"location.href='/ProyectoJSP_EV01_S032_JFEV/home.jsp';\" value=\"Volver\" />");
            out.println("</td>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
