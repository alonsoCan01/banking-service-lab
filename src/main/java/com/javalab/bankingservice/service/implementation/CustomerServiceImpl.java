package com.javalab.bankingservice.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javalab.bankingservice.model.Customer;
import com.javalab.bankingservice.model.NewCustomerRequest;
import com.javalab.bankingservice.repository.CustomerRepository;
import com.javalab.bankingservice.service.CustomerService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository; 

    @Override
    public List<Customer> getCustomers() {
      return customerRepository.findAll();
    }

    @Override
    public Customer addCustomer(NewCustomerRequest request) {
        Customer customer = new Customer();
        customer.setLastName(request.getLastName());
        customer.setFirstName(request.getFirstName());
        customer.setEmail(request.getEmail());

        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCustomer'");
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }
    
}
