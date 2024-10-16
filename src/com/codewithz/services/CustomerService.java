package com.codewithz.services;

import com.codewithz.model.Customer;
import com.codewithz.repository.CustomerRepository;

import java.time.LocalDate;
import java.util.List;

public class CustomerService {

    CustomerRepository customerRepository = new CustomerRepository();

    public String addCustomer(Customer customer){
        int id=customerRepository.getNextId();
        customer.setId(id);
        customer.setDateOfJoin(LocalDate.now());
        return customerRepository.addCustomer(customer);
    }

    public List<Customer> getAllCustomers(){
        return customerRepository.getAllCustomers();
    }

    public Customer getCustomer(int id){
        return customerRepository.getCustomer(id);
    }

    public String updateCustomer(Customer customer,int id){
        return null;
    }

    public String deleteCustomer(int id){
        return null;
    }
}
