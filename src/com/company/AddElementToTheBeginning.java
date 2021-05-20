package com.company;

public class AddElementToTheBeginning {

    public static int[] addElementToTheBeginning(int[] nums, int element){

        int[] newArray = new int[nums.length];

        for(int i = 1; i<newArray.length-1; i++){
            newArray[i] = nums[i-1];
        }

        newArray[0] = element;

        return newArray;
    }
}
