package javaprogramsweek8;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

public class Program2_MinAndMaxiInputChallenge {//class

    public static void main(String[] args) {// main method
        minAndMaxInput();//calling the static method
    }

    public static void minAndMaxInput(){//static method
        Scanner sca = new Scanner(System.in);//scanner declaration for reading input from console
        System.out.println("Please enter total number: ");
        //passing values to the variables
        int numbers = sca.nextInt();
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        System.out.println("Please enter " + numbers + " numbers.");//asking the range of numbers to print
        //implementing the condition
        for (
                int a = 0;
                a < numbers; a++) {
            int current = sca.nextInt();
            if (current > maximum) {
                maximum = current;
            }
            if (current < minimum) {
                minimum = current;
            }
        }
        System.out.println("largest of " + numbers + " numbers is: " + maximum);//printing the max value
        System.out.println("smallest of " + numbers + " numbers is: " + minimum);//printing the min value
        sca.close();//closing scanner
    }
}

