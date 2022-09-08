package com.example.testing.config;

import com.example.testing.model.Customer;
import com.example.testing.model.Employee;
import com.example.testing.model.Position;
import com.example.testing.model.Project;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;

import java.util.Properties;


public class HiberConfig {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/hibt");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "2121");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");

                settings.put(Environment.SHOW_SQL, "true");

                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

                settings.put(Environment.HBM2DDL_AUTO, "validate");

                configuration.setProperties(settings);

                configuration.addAnnotatedClass(Employee.class);
                configuration.addAnnotatedClass(Customer.class);
                configuration.addAnnotatedClass(Position.class);
                configuration.addAnnotatedClass(Project.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
