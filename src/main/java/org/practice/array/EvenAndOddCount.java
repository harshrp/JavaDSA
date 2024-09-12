package org.practice.array;

/**
 * Count number of even and odd elements in an array
 */
public class EvenAndOddCount {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        countEvenAndOddNumbers(arr);
    }

    private static void countEvenAndOddNumbers(int[] arr) {
        int evenCount = 0, oddCount = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Total even numbers in array are " + evenCount + " \nTotal odd numbers in array are " + oddCount);
    }
}