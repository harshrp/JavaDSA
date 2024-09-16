package org.practice.number;

public class PerfectSquare {
    public static void main(String[] args) {
        int number = 49;
        System.out.println(Math.sqrt(number));
        System.out.println(Math.ceil(Math.sqrt(number)));
        System.out.println(Math.floor(Math.sqrt(number)));
        if(Math.ceil(Math.sqrt(number)) == Math.floor(Math.sqrt(number))) {
            System.out.println("Number " + number + " is a perfect square");
        } else {
            System.out.println("Number " + number + " is not a perfect square");
        }
    }
}
