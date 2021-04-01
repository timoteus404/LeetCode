package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s){
        //a b c a b c b b
        int first = 0;
        int second = 0;
        int max = 0;

        HashSet<Character> result = new HashSet<>();

        while (second < s.length()){

            if(! (result.contains(s.charAt(second)))){
                result.add(s.charAt(second));
                second++;
                max = Math.max(result.size(), max);
            }else {
                result.remove(s.charAt(first));
                first++;
            }
        }
        return max;
    }
}


