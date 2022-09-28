//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab4B {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        String strDay;

        //first output and get input
        System.out.print("Enter the day: ");
        strDay = scan.nextLine();

        //if statement determining output
        if (strDay.equals("Monday") || strDay.equals("monday") || strDay.equals("Wednesday") || strDay.equals("wednesday")) {
            System.out.println("I have class today!");
        }
        else if (strDay.equals("Friday") || strDay.equals("friday")) {
            System.out.println("It's Friday! Friday! Gotta get down on Friday!");
        }
        else {
            System.out.println("I should use this time to do my homework.");
        }
    }
}