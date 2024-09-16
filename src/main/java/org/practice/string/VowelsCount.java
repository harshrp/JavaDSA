package org.practice.string;

public class VowelsCount {
    public static void main(String[] args) {
        String str = "education";
        countVowels(str);
    }

    private static void countVowels(String str) {
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'e'
                    || str.toLowerCase().charAt(i) == 'i' || str.toLowerCase().charAt(i) == 'o'
                    || str.toLowerCase().charAt(i) == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Vowels count in word  " + str + " is " + vowelCount);
    }
}
