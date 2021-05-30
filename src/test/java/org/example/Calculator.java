package org.example;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        // Create the Scanner

        Scanner scan= new Scanner(System.in);

        // user input.

        System.out.println("This is my first java basic calculator\n");
        int xe, xo;

        System.out.println("Enter the operator(+,-,*,/)");
        System.out.println("\n please enter two numbers");
        System.out.println("\n First number:");

        xe= scan.nextInt();
        System.out.println("\n Second number:");
        xo= scan.nextInt();

        System.out.println("\n Select between (+,-,*,/)\n Type out basic operation to use:");
        String operator = scan.next();
        String EO= "You have selected";

        switch (operator){

            case"+":
                System.out.println(EO+"+\n Your result:"+(xe+xo));
                break;
            case"-":
                System.out.println(EO+"-\n Your result:"+(xe-xo));
                break;
            case"*":
                System.out.println(EO+"*\n Your result:"+(xe*xo));
            case"/":
                System.out.println(EO+"/\n Your result:"+(xe/xo));
            default:
                System.out.println("\n Please select a valid character");}

        //Close
        scan.close ();
        System.out.println("Closing Application");

    }
}

