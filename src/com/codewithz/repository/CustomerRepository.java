package com.codewithz.repository;

import com.codewithz.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CustomerRepository {

    public static ArrayList<Customer> customerData=new ArrayList<>();

    public String addCustomer(Customer customer){
        boolean customerAdded=customerData.add(customer);
        String status=customerAdded?"Added":"Not added";
        return status;
    }

    public List<Customer> getAllCustomers(){
        return customerData;
    }

    public Customer getCustomer(int id){

        for (Customer customer : customerData) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null; // Return null if not found
    }

    public String updateCustomer(Customer updatedCustomer,int id){
        int index=customerData.indexOf(updatedCustomer);
        Customer customerWhichIsUpdated=customerData.set(index,updatedCustomer);
        if(customerWhichIsUpdated!=null){
            return "Updated";
        }
        return "Not updated";
    }

    public String deleteCustomer(Customer customerToBeDeleted,int id){
        int index=customerData.indexOf(customerToBeDeleted);
        Customer customerWhichIsDeleted=customerData.remove(index);
        if(customerWhichIsDeleted!=null){
            return "Deleted";
        }
        return "Not Deleted";
    }

    public int getNextId(){
        Random random = new Random();
        // Generate a random number between 10000 and 99999 (inclusive)
        int id = 10000 + random.nextInt(90000);
       return id;
    }

    public static Customer findCustomerById(ArrayList<Customer> customers, int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null; // Return null if not found
    }
}
