package com.customers.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customers.data.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
