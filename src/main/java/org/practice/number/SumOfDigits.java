package org.practice.number;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 1345;
        calculateSum(number);
        System.out.println("Sum of digits of number " + number + " is " + calculateSumUsingRecursion(number));
    }

    private static int calculateSumUsingRecursion(int number) {
        if(number == 0) {
            return number;
        }
        return number%10 + calculateSumUsingRecursion(number/10);
    }

    private static void calculateSum(int number) {
        int temp = number;
        int sum = 0;
        while(number > 0) {
            sum += number%10;
            number = number/10;
        }
        System.out.println("Sum of digits of number " + temp + " is " + sum);
    }
}
