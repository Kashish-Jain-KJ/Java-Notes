package Threads;

public class Myclass {
    public static void main(String[] args) {
      Mylass3 obj = new Mylass3();
     
      Mylass2 obj1 = new Mylass2();
    
      obj.start();
   
      obj1.start();
      obj1.yield();
    }
  
}
class Mylass3 extends Thread{
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println("Threat1");
        }
      
    }
} 

class Mylass2 extends Thread{
    public void run() {
      
            System.out.println("Threat2");
        
    }
} 