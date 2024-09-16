package org.practice.number;

public class Fibonacci {
    public static void main(String[] args) {
        int range = 2500;
        System.out.println("Fibonacci sequence till 1000 as below");
        int firstNumber = 1;
        int secondNumber = 1;
        System.out.print(firstNumber);
        printFiboacci(firstNumber, secondNumber, range);
    }

    private static void printFiboacci(int firstNumber, int secondNumber, int range) {
        if (secondNumber <= range) {
            System.out.print(" " + secondNumber);
            printFiboacci(secondNumber, firstNumber + secondNumber, range);
        }
    }
}
