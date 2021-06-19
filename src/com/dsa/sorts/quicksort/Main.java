package com.dsa.sorts.quicksort;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray, 0 , intArray.length);

        for (int i = 0; i < intArray.length; i++){

            System.out.println(intArray[i]);

        }

    }

    public static void quickSort(int[] input, int startIndex, int endIndex){

        if (endIndex - startIndex < 2){

            return;

        }

        int pivotIndex = partition(input, startIndex, endIndex);

        quickSort(input, startIndex, pivotIndex);
        quickSort(input, pivotIndex + 1, endIndex);

    }

    public static int partition(int[] input, int startIndex, int endIndex){

        int pivotIndex = input[startIndex];
        int i = startIndex;
        int j = endIndex;

        while (i < j){

            while (i < j && input[--j] >= pivotIndex);  //empty loop body.

             if (i < j){

                 input[i] = input[j];

             }

             while (i < j && input[++i] <= pivotIndex); //empty loop body.

             if (i < j){

                 input[j] = input[i];

             }

        }

        input[j] = pivotIndex;

        return j;

    }
}
