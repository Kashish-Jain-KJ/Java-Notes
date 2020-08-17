public class ArrayDemo {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;
            //Similarly, you can declare arrays of other types:
            // byte[] anArrayOfBytes;
            // short[] anArrayOfShorts;
            // long[] anArrayOfLongs;
            // float[] anArrayOfFloats;
            // double[] anArrayOfDoubles;
            // boolean[] anArrayOfBooleans;
            // char[] anArrayOfChars;
            // String[] anArrayOfStrings;
        // allocates memory for 10 integers
        anArray = new int[10];     
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

            // Alternatively, you can use the shortcut syntax to create and initialize an array:

            // int[] anArray = { 
            //     100, 200, 300,
            //     400, 500, 600, 
            //     700, 800, 900, 1000
            // };

        System.out.println("Element at index 0: "+ anArray[0]);
        System.out.println("Element at index 1: "+ anArray[1]);
        System.out.println("Element at index 2: "+ anArray[2]);
        System.out.println("Element at index 3: "+ anArray[3]);
        System.out.println("Element at index 4: "+ anArray[4]);
        System.out.println("Element at index 5: "+ anArray[5]);
        System.out.println("Element at index 6: "+ anArray[6]);
        System.out.println("Element at index 7: "+ anArray[7]);
        System.out.println("Element at index 8: "+ anArray[8]);
        System.out.println("Element at index 9: "+ anArray[9]);
    }
    
}



class MultiDimArrayDemo {
    public static void main(String[] args) {
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
    }
}


class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = { 
                '1','2', '3',
                '4', '5', '6', 
                '7', '8', '9', '1'
        };
        System.arraycopy(copyFrom,2, copyTo, 1, 9);
            // public static void arraycopy(Object src, int srcPos,
            // Object dest, int destPos, int length)
        System.out.println("copyFrom: "+new String(copyFrom));

        System.out.println("copyTo: "+new String(copyTo));

        char[] copyTo1 = java.util.Arrays.copyOfRange(copyFrom, 0, 9); 

        System.out.println("copyTo1: "+new String(copyTo1));
    }
}
