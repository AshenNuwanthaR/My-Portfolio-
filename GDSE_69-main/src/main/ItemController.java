package main;

import model.Item;

import java.util.ArrayList;

/**
 * @author Amil Srinath
 */
public class ItemController implements CRUD<Item>{
    @Override
    public void add(Item model, ArrayList<Item> arrayList) {
        arrayList.add(model);
    }

    @Override
    public void delete(int index, ArrayList<Item> arrayList) {
        arrayList.remove(index);
    }

    @Override
    public void update(int index, Item model, ArrayList<Item> arrayList) {
        arrayList.set(index,model);
    }
}
