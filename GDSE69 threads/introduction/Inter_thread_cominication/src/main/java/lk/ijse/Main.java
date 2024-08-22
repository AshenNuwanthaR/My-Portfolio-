package lk.ijse;


class A{

    int num;
    boolean value=false;
    public synchronized void put(int num){

        while (value){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("PUT :"+num);
        this.num = num;
        value = true;
        notify();
    }
    public synchronized void get(){

        while (!value){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("GET :"+num);
        value=false;
        notify();

    }
}
class producer implements Runnable{
        A a;

        public  producer(A a){
            this.a=a;
    Thread t1 =new Thread(this,"producer");
    }
    static class Consumer implements Runnable{
        A  a;
        public Consumer(A a) {
            this.a = a;
        }
            Thread t2 = new Thread(this, "Consumer");
        @Override
        public void run() {
            a.get();
        }
            }
    @Override
    public void run() {
        int i=0;
        while (true){
    a.put(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
    A a = new A();
    new producer(a);
    new producer.Consumer(a);

    }

}