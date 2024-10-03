package org.practice.array;

import java.util.Arrays;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3 ,4 ,5, 6};
        verifyArraySorted(arr1);
        int[] arr2 = {4, 2, 3 ,6 ,7, 2};
        verifyArraySorted(arr2);
    }

    private static void verifyArraySorted(int[] arr) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length; i++) {
            if(i > 0 && arr[i-1] > arr[i]) {
                    isSorted = false;
                    break;
            }
        }
        if (!isSorted) {
            System.out.println("array -" + Arrays.toString(arr) + " is not sorted array");
        } else {
            System.out.println("array -" + Arrays.toString(arr) + " is sorted array");
        }
    }
}
