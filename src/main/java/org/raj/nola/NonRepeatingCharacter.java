package org.raj.nola;

//Given a string s, find the first non-repeating character in it and return its index.
// If it does not exist, return -1.


public class NonRepeatingCharacter {

    static int nonRepeatingCharacterIndex(String input){

        for (int i=0; i<input.length(); i++){

            char c = input.charAt(i);

            if(input.indexOf(c) == input.lastIndexOf(c)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int i=nonRepeatingCharacterIndex("programmingpair");

        System.out.println(i);
    }
}

