/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hacker2
 */
public class StartServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //create a session
        HttpSession session = request.getSession();
        //get data
        String name = request.getParameter("name"); 
        //initialize the session
        InitializeSession(session,name);
        
        RequestDispatcher disp = request.getRequestDispatcher("session_started.jsp");
        disp.forward(request, response);
    }

    private void InitializeSession(HttpSession session, String name) {
        String gender = "",team = "";
        session.setAttribute("name", name);
        session.setAttribute("gender", gender);
    }

    
}
