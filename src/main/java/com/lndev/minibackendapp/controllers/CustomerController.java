package com.lndev.minibackendapp.controllers;

import com.lndev.minibackendapp.dto.RegisterCustomerDTO;
import com.lndev.minibackendapp.model.Customer;
import com.lndev.minibackendapp.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping
    List<Customer> getAllCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping("{customerId}")
    public Optional<Customer> getSingleCustomer(@PathVariable("customerId") Integer id){
        return customerService.getSingleCustomer(id);
    }


    @PostMapping
    public void addCustomer(@RequestBody RegisterCustomerDTO registerCustomerDTO){
        customerService.registerCustomer(registerCustomerDTO);
    }

    @DeleteMapping("{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer id){
        customerService.deleteCustomer(id);
    }

}
