package lk.ijse;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

String name;

public class MyRunnable(String name) {
    this.name=name;
}
@Override
public void run(){

}
public class Main{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 1; i <=5 ; i++) {
            Runnable runnable = new MyRunnable("Worker Thread"+i);
            executorService.execute(runnable);
        }
        executorService.shutdown();
    }
}
