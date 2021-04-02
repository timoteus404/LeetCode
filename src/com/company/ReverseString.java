package com.company;

public class ReverseString {

    public static char[] reverseString(char[] s){

        int i = 0;
        int j = s.length-1;
        char[] x = new char[1];

        while(i!=j && i<j){

            if(i<j){
                x[0] = s[j];
                s[j] = s[i];
                s[i] = x[0];
            }
            i++;
            j--;

        }
        return s;
    }
}
