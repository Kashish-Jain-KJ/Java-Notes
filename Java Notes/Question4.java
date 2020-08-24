public class Question4 {
    

public static float divide(float arg1, float arg2) 
    throws Exception { 
        System.out.println("Exception");// line n1
        return arg1/arg2;
}
    
public static void main(String[] args) {
    int arg1 = 10;
        int arg2 = 0;
    try {  
    int arg3 = arg1/arg2;
        System.out.printf("Result: %f", divide(arg1, arg2));
    } catch (Exception e) {
		System.out.printf(
            "Bad arguments: %d and %d", arg1, arg2); // line n2
    }
}
}