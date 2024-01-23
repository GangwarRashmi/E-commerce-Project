package com.learn.mycart.servlets;

import com.learn.mycart.entities.User;
import com.learn.mycart.helper.FactoryProvider;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class RegisterServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            // Get user data from the request parameters
            String userName = request.getParameter("user_name");
            String userEmail = request.getParameter("user_email");
            String userPassword = request.getParameter("user_password");
            String userPhone = request.getParameter("user_phone");
            String userAddress = request.getParameter("user_address");
            String userType = request.getParameter("user_type"); // Corrected this line

            // Validation
            if (userName.isEmpty()) {
                out.println("Name is blank");
                return; // Stop processing if validation fails
            }

            // Create a User object to store data
            User user = new User(userName, userEmail, userPassword, userPhone, userAddress);
            out.println("object created" + "<br>");

            try (Session hibernateSession = FactoryProvider.getFactory().openSession()) {
                // Use try-with-resources to automatically close the session
                Transaction tx = hibernateSession.beginTransaction();

                long id = (long) hibernateSession.save(user);

                tx.commit();
                out.println("Successfully saved");
                out.println("<br> User id " + id);
            } catch (Exception e) {
                e.printStackTrace(); // Log the exception for debugging
                out.println("An error occurred while processing the registration.");
            }

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.getWriter().append("success");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.getWriter().append("posted");
    }

    @Override
    public String getServletInfo() {
        return "Servlet for user registration";
    }
}
