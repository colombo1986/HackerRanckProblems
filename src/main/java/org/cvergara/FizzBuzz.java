package org.cvergara;

public class FizzBuzz {
    public static void main(String[] args) {

//        int i = 10 ;
//        String output = ((i%3)==0)? (((i%5)==0)? "FizzBuzz" : "Fizz") : (((i%5)==0)? "Buzz" : String.valueOf(i));
//        System.out.println("output = " + output);

        fizzBuzz(100);
    }

    public static void fizzBuzz(int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println( "FizzBuzz");
            }else if (i % 3 == 0) {
                System.out.println("Fizz");
            }else if (i % 5 == 0) {
                System.out.println( "Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
