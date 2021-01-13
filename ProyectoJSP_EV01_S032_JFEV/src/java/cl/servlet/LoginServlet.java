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
public class LoginServlet extends HttpServlet {

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
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
     
    }

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getSession().invalidate();
        
        this.getServletContext().getRequestDispatcher("/paginaPrincipal.jsp").forward(request, response); 
       // processRequest(request, response);
       
        
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
       // processRequest(request, response);
        
       
                
        String rut= (String)request.getParameter("rut");
        String pass= (String)request.getParameter("pass");
        String tipoUser= (String)request.getParameter("perfil");
       
        System.out.println(rut);
        System.out.println(pass);
        System.out.println(tipoUser);
        if("1-9".equals(rut) && "123".equals(pass)){
            
            if("Cliente".equals(tipoUser)){
                request.getSession().setAttribute("tipoUser", tipoUser);
                
                 request.getRequestDispatcher("MostrarCliente").forward(request,response);
                
            }else{
                request.getSession().setAttribute("tipoUser", tipoUser);
                System.out.println("logra54");
               request.getRequestDispatcher("home.jsp").forward(request,response);
            }

        }else{
            String failed="Usuario o contraseña incorrecta";
            request.setAttribute("fail", failed);
           this.getServletContext().getRequestDispatcher("/paginaPrincipal.jsp").forward(request, response);
        
        }
        
        
        
        
    }
    private void response(HttpServletResponse resp, String msg)
			throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<t1>" + msg + "</t1>");
		out.println("</body>");
		out.println("</html>");
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
