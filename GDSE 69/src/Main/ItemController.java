package main;

import model.Customer;
import java.util.ArrayList;

/**
 * @author Amil Srinath
 */
public class CustomerController implements CRUD<Customer>{
    @Override
    public void add(Customer model, ArrayList<Customer> arrayList) {
        arrayList.add(model);
    }

    @Override
    public void delete(int index, ArrayList<Customer> arrayList) {
        arrayList.remove(index);
    }

    @Override
    public void update(int index, Customer model, ArrayList<Customer> arrayList) {
        arrayList.set(index,model);
    }
}