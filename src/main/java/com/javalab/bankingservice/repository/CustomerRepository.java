package com.javalab.bankingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalab.bankingservice.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
}
