package org.cvergara;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {


        String s = "XIX";
        System.out.println(romanToInteger(s));

    }

    private static int romanToInteger(String s) {
        Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i>0 && romanMap.get(s.charAt(i))> romanMap.get(s.charAt(i-1))){

                result += romanMap.get(s.charAt(i))- 2 * romanMap.get(s.charAt(i-1));

            }else{
                result += romanMap.get(s.charAt(i));
            }
        }

        return result;
    }
}

