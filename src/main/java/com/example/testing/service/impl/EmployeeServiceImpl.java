package com.example.testing.service.impl;

import com.example.testing.model.Employee;
import com.example.testing.repository.EmployeRep;
import com.example.testing.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private final EmployeRep employeRep;

    public EmployeeServiceImpl(EmployeRep employeRep) {
        this.employeRep = employeRep;
    }

    @Override
    public Employee createEmployee(Employee employee) {

        return employeRep.addEmployee(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {

        return employeRep.updateEmployee(employee);

    }

    @Override
    public void deleteEmployee(Long id) {
        Employee employee = employeRep.findById(id);
        employeRep.deleteEmployee(employee);
    }
}
