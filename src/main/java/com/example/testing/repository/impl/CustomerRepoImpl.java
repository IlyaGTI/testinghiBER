package com.example.testing.repository.impl;

import com.example.testing.config.HiberConfig;
import com.example.testing.model.Customer;
import com.example.testing.model.Employee;
import com.example.testing.repository.CustomerRepo;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerRepoImpl implements CustomerRepo{

    Transaction transaction = null;

    Session session = HiberConfig.getSessionFactory().openSession();

    @Override
    public Customer addCustomer(Customer customer) {
        transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        return customer;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        transaction = session.beginTransaction();
        session.refresh(customer);
        transaction.commit();
        return customer;
    }

    @Override
    public void deleteCustomer(Customer customer) {
        transaction = session.beginTransaction();
        session.delete(customer);
        transaction.commit();

    }

    @Override
    public Customer findById(Long id) {
        Customer customer = session.get(Customer.class, new Long(id));
        return customer;
    }
}
