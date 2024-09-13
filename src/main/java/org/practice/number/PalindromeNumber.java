package org.practice.number;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 12344321;
        approachUsingNumber(number);
        //approachUsingString(number);
    }

    private static void approachUsingNumber(int number) {
        int numberCopy = number;
        int reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }

        if(reverse == numberCopy) {
            System.out.println(numberCopy + " is palindrome");
        } else {
            System.out.println(numberCopy + " is not palindrome");
        }
    }

    private static void approachUsingString(int number) {
        String strNumber = String.valueOf(number);
        int length = strNumber.length();
        String revString = "";
        for (int i = 0; i < length; i++) {
            revString = strNumber.charAt(i) + revString;
        }
        System.out.println(revString);
        if(Integer.parseInt(revString) == number) {
            System.out.println(number + " is palindrome");
        } else {
            System.out.println(number + " is not palindrome");
        }
    }
}
