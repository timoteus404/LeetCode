package com.company;

public class MaxConsecutiveOnes {

    public static int maxConsecutiveOnes(int [] nums){

        int result = 0;
        int counter = 0;
        int length = nums.length-1;

        for(int i = 0; i <= length; i++){
            if(nums[i] == 1){
                counter++;
            }
            if(nums[i] == 0 || i == length){
                if(result<counter){
                    result = counter;
                }
                counter = 0;
            }

        }
        return result;
    }
}
