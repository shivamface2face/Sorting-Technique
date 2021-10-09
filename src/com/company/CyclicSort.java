package com.company;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[]={3,1,4,2,5};
        CyclicSortt(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void CyclicSortt(int[] arr) {
        int i=0;

        while (i< arr.length){
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);

            }else {
                i++;
            }
        }
    }

   static void swap(int[] arr, int i, int j) {

       int temp=arr[i];
       arr[i]= arr[j];
       arr[j]=temp;

    }
}
