package com.codewithz.controller;

import com.codewithz.model.Customer;
import com.codewithz.services.CustomerService;

import java.util.List;
import java.util.Scanner;

public class CustomerController {
    Scanner scanner = new Scanner(System.in);

    CustomerService customerService = new CustomerService();

    public String addCustomer(){
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter customer email: ");
        String customerEmail = scanner.nextLine();
        System.out.print("Enter customer phone number: ");
        String customerPhoneNumber = scanner.nextLine();
        System.out.print("Enter Banking Account Type [Savings/Current]: ");
        String bankingAccountType = scanner.nextLine();

        Customer customer=new Customer();
        customer.setName(customerName);
        customer.setEmail(customerEmail);
        customer.setPhone(customerPhoneNumber);
        customer.setAccountType(bankingAccountType);

       return  customerService.addCustomer(customer);
    }

    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    public Customer getCustomer(int id){
        return customerService.getCustomer(id);
    }

    public String updateCustomer(Customer customer,int id){
        return null;
    }

    public String deleteCustomer(int id){
        return null;
    }
}
