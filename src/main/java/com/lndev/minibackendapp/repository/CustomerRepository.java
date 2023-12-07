package com.lndev.minibackendapp.repository;

import com.lndev.minibackendapp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer , Integer> {
}
