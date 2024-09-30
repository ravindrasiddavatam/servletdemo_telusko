package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

    // Corrected method signature
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // Parsing the numbers from the request
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i + j;
        
        //req.setAttribute("k", k);
        
     //   res.sendRedirect("sq");
        
//        HttpSession session = req.getSession();
//        session.setAttribute("k", k);
        
        Cookie cookie = new Cookie("k", k + "");
        res.addCookie(cookie);
        res.sendRedirect("sq");
        
//        RequestDispatcher rd = req.getRequestDispatcher("sq");
//        rd.forward(req, res);

//        // Sending response back to the client
//        PrintWriter out = res.getWriter();  // Getting PrintWriter to write the response
//        out.println("Result is: " + k);     // Printing the result to the client browser
    }
}
