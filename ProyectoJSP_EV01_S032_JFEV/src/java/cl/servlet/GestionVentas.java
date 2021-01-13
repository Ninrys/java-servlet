/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.servlet;
import cl.dto.Fruta;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ninry
 */
public class GestionVentas extends HttpServlet {

    
    
    
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
            out.println("<title>Servlet GestionVentas</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GestionVentas at " + request.getContextPath() + "</h1>");
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
        this.getServletContext().getRequestDispatcher("/pages/Mantenedores/GestionarVentas.jsp").forward(request, response); 
       // processRequest(request, response);
       
        
    }
    @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          double suma=0;
        for(int i=0; i<10; i++){
            String req= (String)request.getParameter("frut"+i);
            System.out.println(" Request " + req);
            
            if(req != null){
                    
                    String cant=request.getParameter("cant"+i);
                    if(cant!=null){
                        try {
                             double cantidad= Double.parseDouble(cant);
                   
                    double valor;
                     valor = Fruta.getLista().get(i).getPrecio();
                  
                    double pagar=cantidad*valor;
                  
                    suma=suma+pagar;
                            
                        } catch (Exception e) {
                            System.out.println("D;");
                        }
   
                   
                    }
            }
         }
        
        System.out.println("suma: " + suma);
        
        request.setAttribute("resultado", Double.toString(suma));
       this.getServletContext().getRequestDispatcher("/pages/Mantenedores/GestionarVentas.jsp").forward(request, response); 
        
         
     }
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 /*   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
*/
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
        
    @Override
    public String getServletInfo() {
        return "Short description";
    }
        }

    