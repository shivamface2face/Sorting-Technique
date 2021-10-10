package com.company;

public class DuplicateNo {
    public static void main(String[] args) {
        int arr[] = {2, 1, 4, 2};
        int ans = DuplicateNumber(arr);
        System.out.println(ans);
    }

    private static int DuplicateNumber(int[] arr) {
        int i=0;
        while (i< arr.length){
            if (arr[i]!=i+1){
                int correct=arr[i]-1;
                if (arr[i]!=arr[correct]){
                    swap(arr,i,correct);

                }else {
                   return arr[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }

     static void swap(int[] arr, int i, int j) {

         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;

     }
}
