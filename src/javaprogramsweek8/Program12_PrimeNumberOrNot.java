package javaprogramsweek8;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */

import java.util.Scanner;//imported scanner class to use scanner

public class Program12_PrimeNumberOrNot {//class

    public static void main(String[] args) {//main method
        Program12_PrimeNumberOrNot obj = new Program12_PrimeNumberOrNot();//created an object to instance method
        obj.checkPrimeNumberOrNot();//calling instance method
    }

    public void checkPrimeNumberOrNot() {//instance method
        //declaration og scanner to read the user input
        Scanner sca = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        //assigning values to the variables
        int num = sca.nextInt();
        boolean flag = false;

        //implementing condition
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is not a Prime Number.");
        }
        sca.close();//closing scanner
    }
}


