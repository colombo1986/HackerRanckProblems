package org.cvergara;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int [] numbers = {2, 3, 7, 4, 8};
        int target = 6;
        int[] result = twoSum(numbers, target);
        System.out.println(result[0] + " " + result[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> visitedNumbers = new HashMap<Integer, Integer>(); //ke
        for (int i = 0; i < nums.length; i++) {
            int delta = target - nums[i];
            if(visitedNumbers.containsKey(delta)) {
                return new int[]{i,visitedNumbers.get(delta)};
            }

            visitedNumbers.put(nums[i], i); //content and position
        }

             return new int[]{-1, -1};
    }
}