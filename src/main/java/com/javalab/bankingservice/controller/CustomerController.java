package com.javalab.bankingservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javalab.bankingservice.model.Customer;
import com.javalab.bankingservice.model.NewCustomerRequest;
import com.javalab.bankingservice.service.CustomerService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/customers")
public class CustomerController {
    
    private final CustomerService customerService;

    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }


    @PostMapping
    public Customer addCustomer(@RequestBody NewCustomerRequest request){
        return customerService.addCustomer(request);
    }


    @DeleteMapping("{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer id) {
        customerService.deleteCustomer(id); 
    }
}
