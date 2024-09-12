package org.practice.array;

/**
 * Average number in array
 */
public class AverageNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        countAverageNumber(arr);
    }

    private static void countAverageNumber(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        System.out.println("Average Number in Array is " + total/arr.length);
    }
}
