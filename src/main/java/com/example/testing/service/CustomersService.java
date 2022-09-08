package com.example.testing.service;

import com.example.testing.model.Customer;
import com.example.testing.model.Employee;

public interface CustomersService {

    Customer createCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    void deleteCustomer(Long id);
}
