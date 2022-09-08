package com.example.testing.repository.impl;

import com.example.testing.config.HiberConfig;
import com.example.testing.model.Employee;
import com.example.testing.repository.EmployeRep;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepoImpl implements EmployeRep {

    Transaction transaction = null;

    Session session = HiberConfig.getSessionFactory().openSession();


    @Override
    public Employee addEmployee(Employee employee) {
        transaction = session.beginTransaction();
        // save student object
        session.save(employee);
        // commit transction
        transaction.commit();
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        transaction = session.beginTransaction();
        session.refresh(employee);
        transaction.commit();
        return employee;
    }

    @Override
    public void deleteEmployee(Employee employee) {
        transaction = session.beginTransaction();
        session.delete(employee);
        transaction.commit();
    }

    @Override
    public Employee findById(Long id) {
        Employee employee = session.get(Employee.class, new Long(id));
        return employee;
    }
}
