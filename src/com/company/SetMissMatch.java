package com.company;

public class SetMissMatch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2,4};
        int[] ans = SetMiSSMatch(arr);
        System.out.println(ans);
    }

    static int[] SetMiSSMatch(int[] arr) {

        int i = 0;

        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);

            } else {
                i++;
            }
        }

            for (int index = 0; index < arr.length; index++) {

                if (arr[index] != index + 1) {
                    return new int[]{arr[index], index + 1};
                }
            }


            return new int[]{-1, -1};
        }

    static void swap ( int[] arr, int i, int j){


        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


}