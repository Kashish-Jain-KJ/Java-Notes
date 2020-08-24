public class Doubts {
    public void print(){
        System.out.println("Class Doubts");
    }
}


class Doubts1 extends Doubts{
    public void print(){       
        System.out.println("Class Doubts1");
    }
}


class Run{
    public static void main(String[] args){
        Doubts1 d1 = new Doubts1();
        d1.print();
    }
}