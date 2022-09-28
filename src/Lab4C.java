//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab4C {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        int intCase;
        float fltInput;
        float fltOutput;

        //first output and get input
        System.out.println("Welcome!");
        System.out.print("Please input a number: ");
        fltInput = scan.nextFloat();

        //output 2, input 2, output 3
        System.out.println("");
        System.out.println("What would you like to do to this number:\n0- Get the additive inverse of the number\n1- Get the reciprocal of the number\n2- Square the number\n3- Cube the number\n4- Exit the program\n");
        intCase = scan.nextInt();
        System.out.println("");

        //switch statement determining results based on intCase
        switch (intCase) {
            case 0:
                fltOutput = -1 * fltInput;
                System.out.println("The additive inverse of " + fltInput + " is " + fltOutput);
                break;
            case 1:
                fltOutput = 1 / fltInput;
                System.out.println("The reciprocal of " + fltInput + " is " + fltOutput);
                break;
            case 2:
                fltOutput = fltInput * fltInput;
                System.out.println("The square of " + fltInput + " is " + fltOutput);
                break;
            case 3:
                fltOutput = fltInput * fltInput * fltInput;
                System.out.println("The cube of " + fltInput + " is " + fltOutput);
                break;
            case 4:
                System.out.println("Thank you, goodbye!");
                break;
            default:
                System.out.println("Invalid input, please try again!");
        }

    }
}