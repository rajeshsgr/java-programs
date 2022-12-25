package org.raj.nola;

//Swap 2 numbers without using a third variable
public class Swap2Numbers {

    public static void main(String[] args) {

        int a=10;
        int b=30;

        a=a+b;

        b=a-b;

        a=a-b;

        System.out.println("a after swap :"+ a);
        System.out.println("b after swap :"+ b);


    }
}
