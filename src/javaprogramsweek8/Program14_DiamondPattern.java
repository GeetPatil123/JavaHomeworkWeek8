package javaprogramsweek8;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */

import java.util.Scanner;

public class Program14_DiamondPattern {

    public static void main(String[] args) {//mean method
        Program14_DiamondPattern obj = new Program14_DiamondPattern();//creating an object of instance class
        obj.diamondPattern();// calling the instance method with object
    }

    public void diamondPattern() {//instance method
        Scanner scan = new Scanner(System.in);//scanner declaration for reading input form console
        //declaration og scanner to read the user input
        System.out.print("Enter the number of rows: ");
        //assigning values to the variables
        int rows = scan.nextInt();
        int space = rows - 1;
        int i = 1, j = 1;
        //implementing condition
        while (j <= rows) {//parent wile loop
            System.out.print("\n");//move to next line
            j = 1;
            while (j <= space) {//while loop for print space
                System.out.print(" ");//print space
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {//while loop for printing star
                System.out.print("*");//print star
                j++;
            }
            i++;
            space--;
        }
        i = rows - 1;
        space = 1;
        while (i >= 1) {//parent while loop
            System.out.print("\n");
            j = 1;
            while (j <= space) {
                System.out.print(" ");//print space
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");//print star
                j++;
            }
            i--;
            space++;
        }
        scan.close();// closing scanner
    }
}




















