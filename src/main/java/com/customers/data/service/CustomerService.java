package com.customers.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.customers.data.Entity.Customer;
import com.customers.data.repository.CustomerRepository;

public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	public List<Customer> listAllCustomers(){
		return customerRepository.findAll();
	}
	public void saveUser(Customer customer) {
        customerRepository.save(customer);
    }

    public Customer getCustomer(Integer id) {
        return customerRepository.findById(id).get();
    }

    public void deleteUser(Integer id) {
        customerRepository.deleteById(id);
    }
}
