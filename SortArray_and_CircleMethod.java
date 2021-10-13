package calc;

import java.util.Arrays;
import java.util.Collections;

public class SortArray_and_CircleMethod {

    public static void main(String[] args) {
        
        
        

    }

    public static int[] sortArray(int[] array, String type) {
        /* 
        To  save the data of int araay to Intger d array
         */

        Integer d[] = new Integer[array.length];
        for (int i = 0; i < d.length; i++) {
            d[i] = array[i];
        }

        if (type.equalsIgnoreCase("S")) {
            Arrays.sort(d);

        } else if (type.equalsIgnoreCase("B")) {

            Arrays.sort(d, Collections.reverseOrder());
        }
        /*
            To back and save the d array after doing 
            "Sortin gfrom H->L " in Int 
         */

        for (int i = 0; i < d.length; i++) {
            array[i] = d[i];
        }
        return array;
    }
    //---------------------------------------------------

    public static long nameCharLength(String name) {
        // write your code here

        long d = name.length();
        return d;
    }
    //---------------------------------------------------

    public static String hashtagIt(String[] array) {
        // write your code here
        String hash = "";

        for (int i = 0; i < array.length; i++) {

            hash += "#" + array[i]+" ";
        }
        return hash;
    }
    
    //---------------------------------------------------
    public static double findCircleArea(double radius) {
	double Area = (Math.PI*Math.pow(radius, 2));
        return Area;
}
    //---------------------------------------------------
    
    public static double calculateCircumference(double radius) {
	// write your code here
        double Area = (Math.PI*radius*2);
        return Area;
}
    //---------------------------------------------------
    
    public static double raduis(double circumference) {
	// write your code here
        return circumference/(2*3.14);
}

}
