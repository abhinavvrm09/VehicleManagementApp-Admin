package com.cg.ovms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.ovms.entities.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer>{

	public Customer addCustomer(Customer customer);
	public Customer removeCustomer(Customer customer);
	public Customer viewCustomer(Customer c);
	public Customer updateCustomer(Customer c);
	public List<Customer> viewAllCustomer(String vtype);
	public List<Customer> viewAllCustomersByLocation(String location);
	
}
