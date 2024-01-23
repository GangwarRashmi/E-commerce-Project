package com.learn.mycart.servlets;

import com.learn.mycart.Dao.UserDao;
import com.learn.mycart.entities.User;
import com.learn.mycart.helper.FactoryProvider;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String email = request.getParameter("email");
            String password = request.getParameter("password");

            System.out.println("Email: " + email);
            System.out.println("Password: " + password);

            UserDao userDao = new UserDao(FactoryProvider.getFactory());
            User user = userDao.getUserByEmailAndPassword(email, password);

            // Inside the if (user != null) block
            if (user != null) {
                String userType = user.getUserType();
                if (userType != null) {
                    HttpSession session = request.getSession();
                    session.setAttribute("userType", userType);
                    if ("admin".equalsIgnoreCase(userType)) {
                        response.sendRedirect("admin.jsp");
                    } else if ("normal".equalsIgnoreCase(userType)) {
                        response.sendRedirect("normal.jsp");
                    } else {
                        // Handle unknown user types or redirect to a default page
                        out.println("Unknown user type: " + userType);
                        response.sendRedirect("Login.jsp");
                    }
                } else {
                    // Handle the case where userType is null
                    out.println("User type is null. Check user data.");
                    response.sendRedirect("Login.jsp");
                }
            } else {
                // Handle the case where the user is null
                out.println("Login failed. Please check your credentials.");
                response.sendRedirect("Login.jsp");
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Login Servlet";
    }
}
