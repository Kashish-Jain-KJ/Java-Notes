package Threads;

public class Myclass1 {
    public static void main(String[] args) {
      Myclass3 obj = new Myclass3();
      Myclass2 obj1 = new Myclass2();
      Thread thread1 = new Thread(obj);
      Thread thread2 = new Thread(obj1);
      thread1.start();
      thread2.start();
    }
  
}
class Myclass3 implements Runnable {
    public void run() {
      System.out.println("This code is running in a thread1");
    }
} 

class Myclass2 implements Runnable {
    public void run() {
      System.out.println("This code is running in a thread2");
    }
} 
