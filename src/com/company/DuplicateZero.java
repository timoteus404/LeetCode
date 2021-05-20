package com.company;

import java.util.Arrays;

public class DuplicateZero {
    public static void duplicateZero(int[] arr){
        //4, 5, 0, 15, 6
        int i = 0;
        int j = 0;
        int[] newArr = new int[arr.length];

        while(j <= arr.length-1){

            if(arr[i] == 0){
                newArr[j++] = 0;
                j++;

            }else {
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        for(int o = 0; o<=newArr.length-1; o++){
            arr[o] = newArr[o];
        }
    }
}
