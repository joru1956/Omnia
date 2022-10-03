/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pes.test.db.DatabaseConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

//import code.DatabaseConnection;

/**
 * 
 * 
 * 
 *
 * @author AdminRuzicka
 */
@WebServlet(urlPatterns = {"/pokus"})
public class pokus extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException
    {
        try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");  
            // Initialize the database
            Connection con = DatabaseConnection.initializeDatabase();
  
            // Create a SQL query to insert data into demo table
            // demo table consists of two columns, so two '?' is used
            PreparedStatement st = con.prepareStatement("insert into odecet values(?,?,?,?)");
            out.println("<b>Successfully Inserted"+ "</b>");
  
            // For the first parameter,
            // get the data using request object
            // sets the data to st pointer
            st.setInt(1, Integer.valueOf(request.getParameter("id")));
            st.setDate(2,new java.sql.Date(System.currentTimeMillis()));
            st.setInt(3, Integer.valueOf(request.getParameter("id")));
  
            // Same for second parameter
            st.setString(4, request.getParameter("string"));
  
            // Execute the insert command using executeUpdate()
            // to make changes in database
            st.executeUpdate();
  
            // Close all the connections
            st.close();
            con.close();
  
            // Get a writer pointer 
            // to display the successful result
            out.println("<html><body><b>Successfully Inserted"
                        + "</b></body></html>");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}