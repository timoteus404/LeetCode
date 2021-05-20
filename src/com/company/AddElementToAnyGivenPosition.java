package com.company;

public class AddElementToAnyGivenPosition {

    public static int[] addElementToAnyGivenPosition(int[] nums, int element, int position){
        //array    => [4, 5, 0, 15, 6]
        //element  => 6
        //position => 1
        int newLen = nums.length+1;
        int[] resultArray = new int[newLen];
        int counterOne = 0;
        int counterTwo = 0;

        try {
            while (counterTwo <= resultArray.length - 1) {

                if (counterOne == position && counterOne == counterTwo) {
                    resultArray[position] = element;
                    counterTwo++;
                } else {
                    resultArray[counterTwo] = nums[counterOne];
                    counterOne++;
                    counterTwo++;
                }
            }
        }catch (Exception e){
            System.out.println("Array Index Out Of Bounds Exception: " + e.getMessage());
        }
        return resultArray;
    }
}
