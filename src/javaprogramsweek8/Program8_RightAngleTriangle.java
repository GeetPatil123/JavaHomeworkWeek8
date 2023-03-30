package javaprogramsweek8;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

import java.util.Scanner;

public class Program8_RightAngleTriangle {//class

    public static void main(String[] args) {//main method
        Program8_RightAngleTriangle obj = new Program8_RightAngleTriangle();//created an object of instance method
        obj.rightAngleTriangle();//calling the instance method with object
    }

    public void rightAngleTriangle() {//instance method
        Scanner sca = new Scanner(System.in);//scanner declaration for reading input from console
        int rows, i, j;//assigning values to the variables
        System.out.println("Enter number of rows in pattern");
        rows = sca.nextInt();
        //implementing condition
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; ++j) {
                System.out.print("@ ");
            }
            System.out.print("\n");
        }
        sca.close();//closing scanner

    }
}