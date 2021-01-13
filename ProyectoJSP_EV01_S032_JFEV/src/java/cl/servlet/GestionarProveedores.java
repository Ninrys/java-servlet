/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.servlet;

import cl.dto.Proveedor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ninry
 */
@WebServlet(name = "GestionarProveedores", urlPatterns = {"/GestionarProveedores"})
public class GestionarProveedores extends HttpServlet {

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
       HttpSession session = request.getSession();
        if(session.getAttribute("listaProve")==null){
        ArrayList<Proveedor>listaProve = new ArrayList <>();       
        listaProve.add(new Proveedor("15.456.156-4 ","Patricio Estrella","995999" ));
        listaProve.add(new Proveedor("16.456.156-5 ","Harry Potter","9999999" ));
        listaProve.add(new Proveedor("14.456.156-6 ","Sypha Belnades","9444999" ));
        listaProve.add(new Proveedor("15.455.156-7 ","Vignesh Manoharan","7752022" ));
        listaProve.add(new Proveedor("15.456.154-1 ","El Precioso","9999666" ));
          session.setAttribute("listaProve", listaProve);
          this.getServletContext().getRequestDispatcher("/pages/Mantenedores/GestionarProveedores.jsp").forward(request, response);
        }else{
            this.getServletContext().getRequestDispatcher("/pages/Mantenedores/GestionarProveedores.jsp").forward(request, response);
            
        }
         
      //  processRequest(request, response);
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
        HttpSession session = request.getSession();
        
        
        if(session.getAttribute("listaProve")!=null){
            int i= Integer.parseInt(request.getParameter("borrar"));
        ArrayList <Proveedor> listaProve = (ArrayList)session.getAttribute("listaProve");
        listaProve.remove(i);
        session.setAttribute("listaProve", listaProve);
      this.getServletContext().getRequestDispatcher("/pages/Mantenedores/GestionarProveedores.jsp").forward(request, response);
            
            
        }
        //processRequest(request, response);
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
