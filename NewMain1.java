package calc;

import java.io.*;

import java.util.Arrays;



public class NewMain1 {

    public static void main(String[] args) throws FileNotFoundException, IOException  {
        /*
        FileOutputStream fos = new FileOutputStream
        ("C:\\Users\\m7md\\OneDrive - SFC Hackathon\\Desktop\\v.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        
        dos.writeUTF("MOHAMED KHAMIS");
        dos.close();
        */
        FileInputStream fis = new FileInputStream
        ("C:\\Users\\m7md\\OneDrive - SFC Hackathon\\Desktop\\v.txt");
         
        DataInputStream dis= new DataInputStream(fis);
        
        System.out.println(dis.readUTF());
       
        fis.close();
        
        
        
       

     
        

    }

    public static int[] subArrays(int[] arr1, int[] arr2) {

        /*
        input = [2,4,3] - [1,5,8]
        
        output= [1,-1,-5]
         */
        int z[] = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {

            z[i] = arr2[i] - arr1[i];

        }
        return z;

    }

    public static int[] cumulativeAddition(int[] array) {
        /*
        input = [2,4,3,6,2] 
        
        output = [19,5]
         */
        
        int t = 0;
        for (int i = 0; i < array.length; i++) {
            t += array[i];
        }
        int[] x = {t, array.length};
        return x;
    }

    public static String wordRepeat(String word, int n) {
        /*
        input = "Hi" , 4
        
        output = "HiHiHiHi"
         */
        String t = "";
        for (int i = 0; i < n; i++) {
            t += word + " ";
        }
        return t;
    }

    public static int[] sortArray(int[] array) {
        /*
        input = [2,9,854,3,7]
        
        output = [2,3,7,9,854]
         */
        
        Arrays.sort(array);

        return array;

    }

    public static int exponent_cube(int number) {
        // write your code here
        return (int) Math.pow(number, 3);

    }

    public static int exponent_x(int number, int exponent) {
        // write your code here
        return (int) Math.pow(number, exponent);

    }

    public static String reverseWords(String str1, String str2) {
        // write your code here
        return str1 + "," + str2;
    }

    public static String numbers_range(int number) {
          /*
        input = intger number =5 or 3 
        
        output = As String (5) = "0 1 2 3 4 5"
            (3) = "0 1 2 3"
         */
        
        String s = "";
        for (Integer i = 0; i <= number; i++) {
            s += i.toString() + " ";
        }
        return s;
    }
    
    public static String countDown(int number) {
        
	 String s = "";
        for (Integer i = number; i >= 0; i--) {
            
            s += i.toString() + " ";
        }
        return s;
}
    
    public static double cubes(int num) {
	 /*
        input = intger number =8 or 27
        
        output = 2.0  , 3.0
         */
        
	return Math.ceil(Math.pow(num, 0.3));
}
    
}
