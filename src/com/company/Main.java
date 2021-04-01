package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,2,7};
        int[] nums1 = new int[]{2,5,5,11};
        int[] numb = new int[]{3,2,4};
        int[] numa = new int[]{3,3};
        int[] numc = new int[]{3, 2, 3};
        int[] numsd = new int[]{2,5,5,11};

        int[] ints = TwoSum.twoSum(numsd, 29);

        for(int i: ints){
            System.out.print("[" + i + "]");
        }
    }
}
