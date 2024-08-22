package lk.ijse;


class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("My Thread Is Running");
    }
}


public class ExtendThreadsClass {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();
    }
}