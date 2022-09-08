package com.example.testing.repository;

import com.example.testing.model.Employee;

public class test {

    public static void main(String[] args) {
        EmployeeRepo studentDao = new EmployeeRepo();

        Employee empl = new Employee("Hanah", "hahahnah");
        studentDao.saveStudent(empl);

        System.out.println(empl.getId());
    }
}
