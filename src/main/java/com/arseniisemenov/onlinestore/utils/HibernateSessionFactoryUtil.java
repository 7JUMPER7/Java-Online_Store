package com.arseniisemenov.onlinestore.utils;

import com.arseniisemenov.onlinestore.models.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryUtil() {}

    public static SessionFactory getSessionFactory() {
        if(sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(CartEntity.class);
                configuration.addAnnotatedClass(CartGoodEntity.class);
                configuration.addAnnotatedClass(GoodEntity.class);
                configuration.addAnnotatedClass(ImageEntity.class);
                configuration.addAnnotatedClass(OrderEntity.class);
                configuration.addAnnotatedClass(UserEntity.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch(Exception e) {
                System.out.println("Exception!" + e.getMessage());
            }
        }
        return sessionFactory;
    }
}