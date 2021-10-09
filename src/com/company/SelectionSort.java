package com.company;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={1,4,8,5,7};
      SelectionSortt(arr);
        System.out.println(Arrays.toString(arr));
    }

      static void SelectionSortt(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
               int last=arr.length-i-1;
               int MaxIndex=GetMaxIndex(arr,0,last);
               Swap(arr,MaxIndex,last);

          }

    }

    static void Swap(int[] arr, int maxIndex, int last) {

        int temp=arr[maxIndex];
        arr[maxIndex]= arr[last];
        arr[last]=temp;

    }

    static int GetMaxIndex(int[] arr, int start, int last) {
         int max=start;
              for (int i = start; i <= last ; i++) {
                   if (arr[i]>arr[max]){
                       max=i;
                   }
              }
         return  max;
    }
}
