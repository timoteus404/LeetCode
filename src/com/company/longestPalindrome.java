package com.company;

import java.util.HashMap;
//Runtime: 64.15%
//Memory:  93.06%

//pointer approach
//
public class longestPalindrome {

    public static String longestPalindrome(String s){
        //babad -> bab || aba
        int first = 0;
        int second = 1;
        int counter =0;

        StringBuilder value = new StringBuilder();
        HashMap<Integer, StringBuilder> resultSet = new HashMap<>();

        if(s.length() == 1){
            return s;
        }

        //babad -> bab || aba
        for(; first < s.length(); first++) {

            for (; second <= s.length(); second++) {
                value.append(s.charAt(first));
                value.append(s.charAt(second));
                counter++;

                if (value == value.reverse()) {
                    resultSet.put(counter, value);
                    counter = 0;
                    value.setLength(0);
                }

            }
        }
        String a = value.toString();
        return a;
    }
}
