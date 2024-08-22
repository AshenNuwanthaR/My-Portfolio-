package Main;

import java.util.ArrayList;

/**
 * @author Amil Srinath
 */
public interface CRUD<T> {
    void add(T model, ArrayList<T> arrayList);
    void delete(int index, ArrayList<T> arrayList);
    void update(int index,T model, ArrayList<T> arrayList);
}