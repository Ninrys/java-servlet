/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.servlet;

import cl.dto.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ninry
 */
public class GestionarClientes extends HttpServlet {
    

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
            out.println("<title>Servlet GestionarClientes</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GestionarClientes at " + request.getContextPath() + "</h1>");
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
        this.getServletContext().getRequestDispatcher("/pages/Mantenedores/GestionarCliente.jsp").forward(request, response);
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
        
        System.out.println("------");
        
        String rut=request.getParameter("rut");
        System.out.println(rut);
        String name=request.getParameter("nameCli");
        System.out.println(name);
        String mail=request.getParameter("userMail");
        System.out.println(mail);
        String pais=request.getParameter("pais");
        System.out.println(pais);
        String obser=request.getParameter("obser");
        System.out.println(obser);
          
         HttpSession session = request.getSession();
         
        
        if(session.getAttribute("lista")==null){
            System.out.println("holi");
        ArrayList <Cliente> listaCliente = new ArrayList<>();
        
        listaCliente.add(new Cliente(rut, name, mail, pais, obser));
        
         session.setAttribute("lista", listaCliente);
         this.getServletContext().getRequestDispatcher("/pages/Mantenedores/GestionarCliente.jsp").forward(request, response);
        }else{
            System.out.println("llega aca? -.-");
            ArrayList listaCliente= (ArrayList)session.getAttribute("lista");
            listaCliente.add(new Cliente(rut, name, mail, pais, obser));
            session.setAttribute("lista", listaCliente);
            
            this.getServletContext().getRequestDispatcher("/pages/Mantenedores/GestionarCliente.jsp").forward(request, response);
            
            
        }
       
       
        
       // processRequest(request, response);
        
        
        
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
