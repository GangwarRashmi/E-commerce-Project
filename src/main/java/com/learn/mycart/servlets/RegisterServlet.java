
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
            
            try{
                String userName = request.getParameter("user_name");
                String userEmail = request.getParameter("user_email");
                String userPassword = request.getParameter("user_password");
                String userPhone = request.getParameter("user_phone");
                String userAddress = request.getParameter("user_address");
                
                
                
  //validation
            if(userName.isEmpty()){
                out.println("Name is blank");
            }
            
            //creating user object to store data
            User user = new User(userName, userEmail, userPassword, userPhone,"default.jpg", userAddress);
            
            
            Session hibernateSession = FactoryProvider.getFactory().openSession();//use to save data in hibernate
                Transaction tx  = hibernateSession.beginTransaction();//return transactio
            
                int userId = (int) hibernateSession.save(user);
                
                
                tx.commit();
                hibernateSession.close();
                
                out.println("Succesfully saved");
                out.println("<br> User id "+userId);
            
            
            
            
            
                
            }catch(Exception e){
                e.printStackTrace();//Use for print the imformation in console
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    
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
        return "Short description";
    }// </editor-fold>

}
