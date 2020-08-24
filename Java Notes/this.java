 class Point {
    public int x = 0;
    public int y = 0; 
    static int a = 123;
    public static void main(String[] args) {
        Point p = new Point(10,20,1);
        // Point p1 = new Point(20,20);
        Point p2 = new Point();
        System.out.println(p.x);
        System.out.println(p.y);
        // System.out.println(p1.x);
        // System.out.println(p1.y)  
    } 
    //constructor
    public Point(int x, int y,int z) {
        this.x = x;
        this.y = y;
        this.a = z;
        System.out.println("a"+ this.a);
    }  
    public Point() {
        System.out.println("Normal constructor");
        System.out.println(this.x);
        System.out.println("b"+this.a);
    } 
    
}