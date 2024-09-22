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
import za.ac.tut.model.ManagerClass;
import za.ac.tut.model.ManagerInterface;

/**
 *
 * @author hacker2
 */
public class GenderServlet extends HttpServlet {

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
        //Start session
        HttpSession session = request.getSession();
        String gender = request.getParameter("gender");
        session.setAttribute("gender", gender);
        //business logic
        ManagerInterface mi = new ManagerClass();
        String t = mi.title(gender);
        session.setAttribute("t", t);
        
        RequestDispatcher disp = request.getRequestDispatcher("gender_outcome.jsp");
        disp.forward(request, response);
        
    }
}
