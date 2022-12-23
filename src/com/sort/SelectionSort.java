package com.sort;

public class SelectionSort {

    // Selection Sort
    public static void selectionSort(int[] arr, int size) {
        int min;
        int temp;
        // ال loop الخارجية عشان اخد قيم min كل مره
        // وهنا خليت ال i<size-1 عشان كده كده اخر رقم هيكون مترتب
        for (int i = 0; i < size - 1; i++) { // n=5   0 1 2 3 4
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

}
