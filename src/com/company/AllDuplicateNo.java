package com.company;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicateNo {

    public static void main(String[] args) {
     int[] arr={4,3,2,7,8,2,3,1};
       AllDupliNumber(arr);

    }

    static List<Integer> AllDupliNumber(int[] arr) {
        int i=0;

        while (i< arr.length){
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);

            }else {
                i++;
            }

        }
        List<Integer>ans=new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index+1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int i, int j) {


        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }



}

