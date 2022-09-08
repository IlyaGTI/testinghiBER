package com.example.testing.service.impl;

import com.example.testing.model.Customer;
import com.example.testing.repository.CustomerRepo;
import com.example.testing.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomersService {
    @Autowired
    private final CustomerRepo customerRepo;

    public CustomerServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepo.addCustomer(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepo.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        Customer customer = customerRepo.findById(id);
        customerRepo.deleteCustomer(customer);
    }
}
