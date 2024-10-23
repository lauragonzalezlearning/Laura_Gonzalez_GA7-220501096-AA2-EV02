
package com.mycompany.mavenjspweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "servlets", urlPatterns = {"/servlets"})
public class servlets extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("mostrar_datos.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try (
                Connection con = DatabaseConnection.initializeConnection();
                
                PreparedStatement st = con.prepareStatement("insert into usuarios values(?,?,?)");
                
                ){
            
                st.setString(1,request.getParameter(""));
                st.setString(2,request.getParameter("nombre"));
                st.setString(3,request.getParameter("apellido"));
                
                st.execute();
                
           PrintWriter out = response.getWriter();
           out.println("<html><body><script>alert('Los datos se ingresaron correctamente'); location.href='index.jsp'</script></body></html>");
                
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(servlets.class.getName()).log(Level.SEVERE, null, ex);
             PrintWriter out = response.getWriter();
           out.println("<html><body><script>alert('Error, no se ingresaron los datos'); location.href='index.jsp'</script></body></html>");
        }
        
        
        
        
    }


}
