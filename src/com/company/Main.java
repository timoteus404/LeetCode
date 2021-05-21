package com.company;

public class Main {

    public static void main(String[] args) {
            int[] array = {9,2,1,11,8,0,18};

            var a = MergeSort.mergeSort(array);

            for(int i: a){
                System.out.print(i + " ");
            }

    }
}
