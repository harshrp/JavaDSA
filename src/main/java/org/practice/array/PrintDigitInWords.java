package org.practice.array;

public class PrintDigitInWords {
    static String[] numbers = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    public static void main(String[] args) {
        int digit = 1234;
        printInWords(digit);
    }

    private static void printInWords(int digit) {
        String strNumber = String.valueOf(digit);
        String[] arr = strNumber.split("");
        for (String str: arr) {
            System.out.print(numbers[Integer.parseInt(str)] + " ");
        }
    }


}
