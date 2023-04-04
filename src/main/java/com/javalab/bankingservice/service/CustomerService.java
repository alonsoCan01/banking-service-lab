package com.javalab.bankingservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javalab.bankingservice.model.Customer;
import com.javalab.bankingservice.model.NewCustomerRequest;

@Service
public interface CustomerService {

    List<Customer> getCustomers();
    Customer addCustomer(NewCustomerRequest request);
    Customer updateCustomer(Integer id);
    void deleteCustomer(Integer id);
}
