package org.raj.nola;

import java.util.Scanner;

//Reverse a given integer

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");

        int inputNum= sc.nextInt();

        int reversedNum=0;

        while(inputNum!=0){

            reversedNum=reversedNum*10+inputNum%10;
            inputNum=inputNum/10;

        }
        System.out.println("Input Recieved: "+inputNum);
        System.out.println("Reversed Number :"+reversedNum);

    }
}
