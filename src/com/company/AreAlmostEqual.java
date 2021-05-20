package com.company;

public class AreAlmostEqual {
    //THE WORST POSSIBLE SOLUTION EVER
    //runtime: 5.20% (never mind fucker)
    //memory: 5.40% (better than runtime bro)
    //
    //Just check the code if you need an explanation
    //have spent my whole day for this slow-mo solution.

    public boolean areAlmostEqual(String s1, String s2) {

        if(s1.equals(s2)){
            return true;
        }


        StringBuilder y = new StringBuilder(s1);
        StringBuilder x = new StringBuilder(s2);

        for(int i = 0; i<x.length()-1; i++){

            for(int j = 0; j<=x.length()-1; j++){

                char temp = x.charAt(i);
                x.setCharAt(i, x.charAt(j));
                x.setCharAt(j, temp);

                if(y.toString().equals(x.toString())){
                    return true;
                }else{
                    x = new StringBuilder(s2);
                }
            }
        }
        return false;
    }
}
