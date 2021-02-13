package com.knetapp.dao;

import com.knetapp.models.Technology;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Criado por Junior Kaibro.
 */
@Component
public class TechnologyDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public List<Technology> getFruits(int count) {
        return sessionFactory.getCurrentSession().createCriteria(Technology.class).addOrder(Order.desc("value")).setMaxResults(count).list();
    }
}
