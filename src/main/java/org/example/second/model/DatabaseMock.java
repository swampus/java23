package org.example.second.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class DatabaseMock {
    private static SessionFactory factory;


    public List<GymClient> loadClients() {
        Session session = getCurrentSessionFromConfig();
        session.beginTransaction();
        List<GymClient> list =
                session.createQuery("FROM GymClient", GymClient.class).list();
        return list;
    }
    public static Session getCurrentSessionFromConfig() {
        // SessionFactory in Hibernate 5 example
        Configuration config = new Configuration();
        config.configure();
        // local SessionFactory bean created
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        return session;
    }
}
