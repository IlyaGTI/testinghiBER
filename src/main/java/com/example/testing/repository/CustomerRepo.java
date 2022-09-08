package com.example.testing.repository;

import com.example.testing.model.Customer;


public interface CustomerRepo {

    Customer addCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    void deleteCustomer(Customer customer);

    Customer findById(Long id);
}
