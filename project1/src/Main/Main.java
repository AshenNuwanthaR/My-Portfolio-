package Main;

import model.Customer;
import model.Item;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String args[]){
        ArrayList<Item> itemArrayList = new ArrayList<Item>();
        Item i1 = new Item(1,"Book",20,50.7);

        ArrayList<Customer> CustomerArrayList = new ArrayList<Customer>();
        Customer c1 = new Customer(1,"kasun","61,hakmana,matara");
        Customer c2 = new Customer(2,"pasindu","66,hakmana,kaduwela");
for (Customer customer: CustomerArrayList){
    if (customer.getId().equals("2")){
        new CustomerController().delete(index,CustomerArrayList);
    }

}

    }

}
