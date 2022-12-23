package com.sort;

public class InsertionSort {

    // Insertion Sort
    public static void insertionSort(int[] arr, int size) {
        int temp, j;
        for (int i = 1; i < size; i++) {
            temp = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

}
