package com.example.testing.repository;

import com.example.testing.model.Employee;

public interface EmployeRep {

    Employee addEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(Employee employee);

    Employee findById(Long id);


}
