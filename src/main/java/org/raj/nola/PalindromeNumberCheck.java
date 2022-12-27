package org.raj.nola;

import java.util.Scanner;

public class PalindromeNumberCheck {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");

        int inputNum=sc.nextInt();
        int originalNum=inputNum;

        int revNum=0;

        while(inputNum!=0){

            revNum=revNum*10 + inputNum%10;

            inputNum=inputNum/10;
        }
        
        if(originalNum==revNum){
            System.out.println("Palindrome Number");
        }else {
            System.out.println("Not a Palindrome Number");
        }

    }
}
