package com.sort;

public class BubbleSort {

    // Bubble Sort
    public static void bubbleSort(int[] arr, int size) {
        // ده متغير عشان اعرف هل ال array بتاعتي sorted في نهاية كل لفة ولا لا
        // عشان لو هي sorted في لفة معينه مش لازم اني اكمل باقي اللفات واضيع Time زيادة
        boolean noSwap = true;
        int temp, count = 0;
        // Size-1 لانه كده كده اخر عنصر هيبقى مترتب تلقائي
        for (int i = 0; i < size - 1; i++) {
            // وهنا size-1-i عشان اقلل عملية ال compare كل مره
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    noSwap = false;
                    // يعني معملش swap
                    // يعني وقف ال loop خلاص ال array بقيت sort
                }
                count++;
            }
            // هنا بقا لو هو لف لفة كاااملة ومعملش swap كده معناه انها Sorted
            if (noSwap)
                break;
        }
        System.out.println("Number of rounds =  " + count);
    }

}
