package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearesNo {
    public static void main(String[] args) {



    }

       static  List<Integer> DisapperdNumber(int[] arr) {
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
                   ans.add(index+1);
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
