 
package calc;

public class NewMain {

    public static void main(String[] args) {

    }

    //----------------------------------------------------
    public static String Captalize(String str1) {
        // write your code here
        // get First letter of the string
        String firstLetStr = str1.substring(0, 1);
        // Get remaining letter using substring
        String remLetStr = str1.substring(1);
        // convert the first letter of String to uppercase
        firstLetStr = firstLetStr.toUpperCase();
        // concantenate the first letter and remaining string
        String firstC = firstLetStr + remLetStr;
        return firstC;
    }

    //----------------------------------------------------
    public static boolean isInRange(int x, int y, int z) {
        // write your code here
        if (y >= x && y <= z) {
            return true;

        } else {
            return false;
        }
    }

    //----------------------------------------------------
    public static String repeatFunc(String str1, int count) {
        // write your code here
        String temp = "";
        for (int i = 0; i < count; i++) {
            temp += str1;

        }
        return temp;
    }

    //----------------------------------------------------
    public static String Reciprcalstring(String word) {
        Character ch = null;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);

            // Checking if the character
            // is a letter or not
            if (Character.isLetter(ch)) {

                // converting lowercase character
                // To reciprocal character
                if (Character.isLowerCase(ch)) {
                    ch = (char) (122 - (int) (ch) + 97);
                } // converting uppercase character
                // To reciprocal character
                else if (Character.isUpperCase(ch)) {
                    ch = (char) (90 - (int) (ch) + 65);
                }
            }

            // display each character
        }
        return ch.toString();
    }

    //----------------------------------------------------
    public static String replaceFunc(String character) {
        // write your code here
        Character c = character.charAt(0);
        c = (char) (90 - (int) (c) + 65);

        return c.toString();
    }

    //----------------------------------------------------
    public static String findLongestWord(String str1) {
        // write your code here
        String f = "";

        String w[] = str1.split(" ");

        for (int i = 0; i < w.length; i++) {

            if (w[i].length() > f.length()) {
                f = w[i];
            }
        }
        return f;
    }

    //----------------------------------------------------
    public static String OddOrEven(int num) {
        // write your code here
        int sum = 0;
        while (num != 0) {

            sum += num % 10;
            num = num / 10;
        }
        if (sum % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

}
