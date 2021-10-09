package com.company;

import java.util.Arrays;

public class InsertionSort {


    public static void main(String[] args) {

        int arr[]={8,1,4,5,7};
        InsertionSortt(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void InsertionSortt(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i+1; j >0 ; j--) {

                if (arr[j-1]>arr[j]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }

            }

        }

    }

        static void swap(int[] arr, int j, int i) {

            int temp=arr[j];
            arr[j]= arr[i];
            arr[i]=temp;

    }

}
