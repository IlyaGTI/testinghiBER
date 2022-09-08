package com.example.testing.repository;

import com.example.testing.config.HiberConfig;
import com.example.testing.model.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeRepo {

    public void saveStudent(Employee emp) {

        Transaction transaction = null;

        // auto close session object
        try (Session session = HiberConfig.getSessionFactory().openSession()) {

            // start the transaction
            transaction = session.beginTransaction();

            // save student object
            session.save(emp);

            // commit transction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
