package org.practice.number;

public class NaturalNumSumUsingRecursion {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Sum of first " + number + " natural numbers is " +calculateSum(5));
    }

    private static int calculateSum(int i) {
        if(i == 0) {
            return 0;
        }
        return i + calculateSum(i-1);
    }
}
