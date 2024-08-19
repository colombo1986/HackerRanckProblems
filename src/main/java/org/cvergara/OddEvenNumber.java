package org.cvergara;

public class OddEvenNumber {

    public static void main(String[] args) {

        int n = 29;

        if (n % 2 != 0) {
            // Si n es impar
            System.out.println("Weird");
        } else {
            // Si n es par
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            }
        }
    }
}
