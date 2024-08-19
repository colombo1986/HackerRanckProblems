package org.cvergara;
import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {

    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(5, 11, 22, 25, 6, -1 , 8, 10, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
        int count = 0;
        boolean validateSeq = false;

        for (Integer array1 : array) {

            for (Integer seq : sequence) {

                if (array1 == seq) {
                    count++;
                }
            }

            if (count >= sequence.size()-1) {
                validateSeq = true;
                break;
            }
        }


        System.out.println("count = " + count);
        System.out.println(validateSeq);
    }
}
