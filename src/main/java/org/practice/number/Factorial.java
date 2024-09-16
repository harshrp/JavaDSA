package org.practice.number;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(facorialUsingRecursion(number));
    }

    private static int facorialUsingRecursion(int number) {
        if(number <= 1)
            return 1;
        return number * facorialUsingRecursion(number -1);
    }
}
