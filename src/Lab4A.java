
//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab4A {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        float fltExam;

        //first output, input, math, and second output
        System.out.print("Enter the score of your exam: ");
        fltExam = scan.nextFloat();
        System.out.print("Letter grade is: ");

        //if statement determining output based on exam grade
        if (fltExam >= 97.5) {
            System.out.println("A+");
        }
        else if (fltExam >= 94.5) {
            System.out.println("A");
        }
        else if (fltExam >= 91.5) {
            System.out.println("A-");
        }
        else if (fltExam >= 88.5) {
            System.out.println("B+");
        }
        else if (fltExam >= 85.5) {
            System.out.println("B");
        }
        else if (fltExam >= 82.5) {
            System.out.println("B-");
        }
        else if (fltExam >= 79.5) {
            System.out.println("C+");
        }
        else if (fltExam >= 76.5) {
            System.out.println("C");
        }
        else if (fltExam >= 73.5) {
            System.out.println("C-");
        }
        else if (fltExam >= 70.5) {
            System.out.println("D+");
        }
        else if (fltExam >= 67.5) {
            System.out.println("D");
        }
        else if (fltExam >= 64.5) {
            System.out.println("D-");
        }
        else {
            System.out.println("F");
        }

    }
}