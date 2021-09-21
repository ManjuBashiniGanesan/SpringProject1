package com.example.service;

import java.util.List;

import com.example.entities.Customer;

public interface ICustomerService {
     public Customer addCustomer(Customer cust);
     public Customer updateCusstomer(Customer cust);
     public Customer removeCustomer(Customer cust);
     public Customer viewCustomer(Customer cust);
     public List<Customer> viewAllCustomers(String Location);
}
