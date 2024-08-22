package lk.ijse;
class CommonClass<T> {
    T obj;


    public CommonClass(T obj) {
        this.obj = obj;
    }


    public T getObj() {
        return obj;
    }


    public void setObj(T obj) {
        this.obj = obj;
    }


    public void print() {
        System.out.println("Class name: " + getClass().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        CommonClass<Integer> icc = new CommonClass<Integer>(100);
        icc.print();


        CommonClass<Boolean> bcc = new CommonClass<Boolean>(true);
        bcc.print();


        CommonClass<String> scc = new CommonClass<String>("Damith");
        scc.print();
    }
}

