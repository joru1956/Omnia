/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tm.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AdminRuzicka
 */
public class PesTestServlet extends HttpServlet {

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
            
            String txt = "<h1 align=\"center\" style=\" font: 30px bold Times New Roman\">\n" +
"            Omnia\n" +
"        </h1>\n" +
"         <nav id='menu'></nav>\n" +
"        <div align=\"center\">Login</div>\n" +
" <form action=\"action_page.php\" method=\"post\">\n" +
"  <div class=\"imgcontainer\">\n" +
"    <img src=\"pic/map-of-the-world-g6bdaf7ced_1920.jpg\" alt=\"Avatar\" class=\"avatar\">\n" +
"  </div>\n" +
"\n" +
"  <div class=\"container\">\n" +
"    <label for=\"uname\"><b>Username</b></label>\n" +
"    <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required>\n" +
"\n" +
"    <label for=\"psw\"><b>Password</b></label>\n" +
"    <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n" +
"\n" +
"    <button type=\"submit\">Login</button>\n" +
"    <label>\n" +
"      <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Remember me\n" +
"    </label>\n" +
"  </div>\n" +
"\n" +
"  <div class=\"container\" style=\"background-color:#f1f1f1\">\n" +
"    <button type=\"button\" class=\"cancelbtn\">Cancel</button>\n" +
"    <span class=\"psw\">Forgot <a href=\"#\">password?</a></span>\n" +
"  </div>\n" +
"</form>  ";
            
            out.println("<head>");
            out.println("<title>Servlet PesTestServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            String password = request.getParameter("password");
            
            out.println(txt);
            
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
