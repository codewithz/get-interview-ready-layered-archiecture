import com.codewithz.controller.CustomerController;
import com.codewithz.model.Customer;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        CustomerController  customerController=new CustomerController();
        System.out.println("Welcome to Code With Z Bank");

        while(true) {
            System.out.println("--------------- Select your operation------------------");
            System.out.println("Enter 1 : Adding a new Customer");
            System.out.println("Enter 2 : Getting List of all the Customers");
            System.out.println("Enter 3 : Getting a Single Customer");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    String result=customerController.addCustomer();
                    System.out.println("Customer Addition:"+result);
                    break;
                case 2:
                    List<Customer> customers=customerController.getAllCustomers();
                    for(Customer customer : customers) {
                        System.out.println(customer);
                    }
                    break;
                case 3:
                    System.out.println("Enter the Id for the customer:");
                    int id = scanner.nextInt();
                    Customer customer=customerController.getCustomer(id);
                    if(customer == null) {
                        System.out.println("Customer with id "+id+" not found");
                    }
                    else{
                        System.out.println(customer);
                    }
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}