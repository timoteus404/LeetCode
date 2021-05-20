package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nums = {4, 5, 0, 15, 6};

        DuplicateZero.duplicateZero(nums);

        for(int i:nums){
            System.out.print(i + " ");
        }
    }
}
