package org.raj.nola;

public class ReverseString {

    static String reverseString(String input){

        int inputLength=input.length();

        StringBuilder reversedString = new StringBuilder();

        for (int i= inputLength-1; i>=0; i--){

            reversedString.append(input.charAt(i));
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {

        System.out.println(reverseString("Merry Christmass"));
    }
}
