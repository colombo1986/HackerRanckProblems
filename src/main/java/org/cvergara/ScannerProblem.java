package org.cvergara;

import java.util.Scanner;

public class ScannerProblem {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Scanner scanner = new Scanner(System.in);


        for(int i = 0 ; i<=2 ; i++){

            String myString = scanner.next();
            System.out.println(myString);


        }

        scanner.close();

    }


}