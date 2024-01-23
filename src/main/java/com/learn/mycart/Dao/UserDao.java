package com.learn.mycart.Dao;

import com.learn.mycart.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class UserDao {

    private final SessionFactory factory;

    public UserDao(SessionFactory factory) {
        this.factory = factory;
    }

    public User getUserByEmailAndPassword(String email, String password) {
        User user = null;
        try (Session session = this.factory.openSession()) {
            String hql = "FROM User u WHERE u.userEmail = :e AND u.userPassword = :p";
            Query<User> query = session.createQuery(hql, User.class);
            query.setParameter("e", email);
            query.setParameter("p", password);
            user = query.uniqueResult();

            // Log the SQL query
            System.out.println("SQL Query: " + query.getQueryString());

            // Print user details for debugging
            if (user != null) {
                System.out.println("User Details: " + user.getId() + ", " + user.getUserType());
            } else {
                System.out.println("User not found for email: " + email);
            }
        } catch (Exception e) {
            System.err.println("Error in UserDao.getUserByEmailAndPassword: " + e.getMessage());
            e.printStackTrace();
        }
        return user;
}}