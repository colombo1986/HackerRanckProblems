package org.cvergara;

public class ReverseNumber {

    public static void main(String[] args) {

        int numero = 10 ;
        System.out.println(reverseNumber(numero));

    }

    public static String reverseNumber(int number) {

        String transform = String.valueOf(number);
        return new StringBuilder(transform).reverse().toString();
    }


}
