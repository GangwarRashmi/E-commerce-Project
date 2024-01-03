package com.learn.mycart.Dao;

import com.learn.mycart.entities.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CategoryDao {

    private SessionFactory factory;

    public CategoryDao(SessionFactory factory) {
        this.factory = factory;
    }

    public int saveCategory(Category cat) {
        Session session = this.factory.openSession();
        Transaction tx = session.beginTransaction();

        int catId = (int) session.save(cat);
        tx.commit();

        session.close();
        
        return catId;

    }
}
