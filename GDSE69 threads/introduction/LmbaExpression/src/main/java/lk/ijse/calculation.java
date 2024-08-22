package lk.ijse;

public class calculation {
    int num;

    public synchronized void increment() {
        num++;
    }
}


class main {
    public static void main(String[] args) {
        calculation c = new calculation();

        Thread t1 = new Thread(()->{
          for (int i = 1; i <= 1000; i++) {
              c.increment();
              System.out.println(c.num);
          }
      });
        Thread t2 = new Thread(()->{
            for (int i = 1; i <=1000 ; i++) {
                c.increment();
                System.out.println(c.num);
            }
        });

        t1.start();
        t2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Value is "+c.num);


    }
}