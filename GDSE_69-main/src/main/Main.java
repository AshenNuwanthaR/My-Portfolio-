package main;

import model.Customer;
import model.Item;

import java.util.ArrayList;

/**
 * @author Amil Srinath
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        ArrayList<Item> itemArrayList = new ArrayList<>();

        Customer c1 = new Customer("C001", "Sajith", "No 4");
        Customer c2 = new Customer("C002", "Anura", "No 6");

        // Create/add
        new CustomerController().add(c1,customerArrayList);
        new CustomerController().add(c2,customerArrayList);

        // View/Read
        for (Customer customer:customerArrayList) {
            System.out.println(customer);
        }

        System.out.println("----------------------------");


        //Delete
        /*int index=0;
        for (Customer customer:customerArrayList) {
            if (customer.getId().equals("C002")){
                new CustomerController().delete(index,customerArrayList);
                break;
            }
            index++;
        }*/

        // View/Read
        for (Customer customer:customerArrayList) {
            System.out.println(customer);
        }

        System.out.println("----------------------------");

        //Update

        Customer c3 = new Customer("C002", "Anura", "No 2");

        int index1=0;
        for (Customer customer:customerArrayList) {
            if (customer.getId().equals("C002")){
                new CustomerController().update(index1,c3,customerArrayList);
                break;
            }
            index1++;
        }

        // View/Read
        for (Customer customer:customerArrayList) {
            System.out.println(customer);
        }

        //---------------------------Item---------------------------------

        Item i1 = new Item("I001", "Book", 12, 200);
        Item i2 = new Item("I002", "Pen", 15, 40);
        Item i3 = new Item("I003", "Pencil", 20, 30);


        //add
        new ItemController().add(i1,itemArrayList);
        new ItemController().add(i2,itemArrayList);
        new ItemController().add(i3,itemArrayList);

        System.out.println("--------------Item Added--------------");

        for (Item item:itemArrayList) {
            System.out.println(item);
        }

        System.out.println("--------------Item Deleted--------------");

        //delete
        int index2=0;
        for (Item item:itemArrayList) {
            if (item.getId().equals("I002")){
                new ItemController().delete(index2,itemArrayList);
                break;
            }
            index2++;
        }


        for (Item item:itemArrayList) {
            System.out.println(item);
        }


        //update
        Item i4 = new Item("I003", "Pencil", 20, 40);

        int index3=0;
        for (Item item:itemArrayList) {
            if (item.getId().equals("I003")){
                new ItemController().update(index3,i4,itemArrayList);
                break;
            }
            index3++;
        }


        System.out.println("--------------Item Updated--------------");

        for (Item item:itemArrayList) {
            System.out.println(item);
        }
    }
}
