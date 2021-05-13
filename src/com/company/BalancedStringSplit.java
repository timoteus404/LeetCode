package com.company;

public class BalancedStringSplit {
    //Runtime: 100%
    //Memory: 47%
    //If chartAt(x) equals to 'L' (or 'R' doesn't really matter) count +1.
    //Else count -1.
    //Checking in each iteration to count = 0; if true result is getting +1.
    //Loops till the end of s.length()-1;

    public int balancedStringSplit(String s) {

        StringBuilder e = new StringBuilder(s);
        int result = 0;
        int count = 0;
        int i = 0;

        while(i <= e.length()-1){

            if(e.charAt(i) == 'L'){
                count++;
                i++;
            }else{
                count--;
                i++;
            }

            if(count == 0){
                result++;
            }
        }
        return result;
    }

}
