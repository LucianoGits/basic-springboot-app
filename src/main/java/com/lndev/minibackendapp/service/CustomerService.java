package com.lndev.minibackendapp.service;

import com.lndev.minibackendapp.dto.RegisterCustomerDTO;
import com.lndev.minibackendapp.model.Customer;
import com.lndev.minibackendapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getSingleCustomer(Integer id){
        return customerRepository.findById(id);
    }
    public void registerCustomer(RegisterCustomerDTO registerCustomerRequest){
        Customer customer = new Customer();
        customer.setUsername(registerCustomerRequest.username());
        customer.setEmail(registerCustomerRequest.email());
        customer.setAge(registerCustomerRequest.age());

        customerRepository.save(customer);
    }

    public void deleteCustomer(Integer id){
        customerRepository.deleteById(id);
    }
}
