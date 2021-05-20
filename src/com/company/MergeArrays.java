package com.company;

import java.util.Arrays;

public class MergeArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        for(int i = 0; i<n; i++){
            nums1[m] = nums2[i];
            m++;
        }
        Arrays.sort(nums1);
    }
}
