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
        try {
            String query = "FROM User WHERE userEmail = :e AND userPassword = :p";
            Session session = this.factory.openSession();
            Query<User> q = session.createQuery(query, User.class);
            q.setParameter("e", email);
            q.setParameter("p", password);
            user = q.uniqueResult();

            session.close();

        } catch (Exception e) {
            // Log the exception or handle it as needed
            e.printStackTrace();
        }
        return user;
    }
}
