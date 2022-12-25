package org.raj.nola;

//Check if a vowel is present in a string.

public class CheckVowelInString {

    public static boolean stringContainsVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }

    public static void main(String[] args) {

        System.out.println(stringContainsVowels("stck"));
        System.out.println(stringContainsVowels("is there a vowel"));


    }

}
