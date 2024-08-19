package org.cvergara;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Hello World";
        System.out.printf(reverse(str));
        System.out.println(reverseManually(str));


    }

    //Using the reverse method in String builder
    private static String reverse(String str) {
        return new StringBuilder(str)
                .reverse()
                .toString();
    }

    private static String reverseManually(String str) {

        StringBuilder reversed = new StringBuilder() ;

        for (int i = str.length() - 1 ; i >= 0 ; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
