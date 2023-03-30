package javaprogramsweek8;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

import java.util.Scanner;//imported scanner class to user scanner

public class Program9_FibonacciNumber {

    public static void main(String[] args) {//main method
        fibonacciNumber();// calling the static method
    }

    public static void fibonacciNumber() {//static method
        //assigning values to the variables
        int num1 = 0, num2 = 1, count = 0;
        Scanner sca = new Scanner(System.in);
        System.out.println("Please enter the number to print Fibonacci series: ");
        int no = sca.nextInt();
        while (count < no) {// iterate till count is equal to no
            System.out.print(num1 + " ");// print the numbers

            //swapping the numbers
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            count = count + 1;
        }
        sca.close();//closing scanner
    }


}
