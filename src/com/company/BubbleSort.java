package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
      int arr[]={9,4,5,7};
      BubbleSortt(arr);
        System.out.println(Arrays.toString(arr));
    }

      static void BubbleSortt(int[] arr) {
          for (int i = 0; i < arr.length; i++) {
              for (int j = 1; j < arr.length-i; j++) {
                     if (arr[j-1]>arr[j]){
                         int temp=arr[j];
                         arr[j]= arr[j-1];
                         arr[j-1]=temp;
                     }
              }

          }
    }
}
