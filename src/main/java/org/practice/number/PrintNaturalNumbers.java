package org.practice.number;

public class PrintNaturalNumbers {
    public static void main(String[] args) {
        int number = 10;
        printNumbers(1, number);
    }

    private static void printNumbers(int i, int number) {
        if(i > number) {
            return;
        }
        System.out.print(i + " ");
        printNumbers(i+1, number);
    }
}
