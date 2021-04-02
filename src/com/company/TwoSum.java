package com.company;
//Runtime: 100.00%
//Memory:  64.52%

//two pointer approach with i(slow) & j(fast)
//loop breaks when i+j==target || i == last index of array
//i(slow) pointer increments only when j == last index
public class TwoSum {

    public static int[] twoSum(int[] nums, int target){

        int[] result = new int[2];
        boolean state = true;
        int i =0;
        int j =1;

        while(state){
            //3,2,3 // 2,5,5,11
            if(nums[i] + nums[j] == target){
                result[0] = i;
                result[1] = j;
                state =false;
            }else if(j == nums.length-1){
                i += 1;
                j = i+1;
            }else{
                j+=1;
            }

            if(i == nums.length-1){
                state = false;
            }
        }
        return result;
    }
}
