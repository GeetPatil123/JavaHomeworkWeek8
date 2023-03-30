package javaprogramsweek8;

/**
 * 15. Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * *
 */
public class Program15_LeftAngleTriangle {//class

    public static void main(String[] args) {// main method
        Program15_LeftAngleTriangle obj = new Program15_LeftAngleTriangle();// created an object of instance class
        obj.leftAngleTringle();//calling the instance method with object
    }

    public void leftAngleTringle() {// instance method

        int rows = 5; //asking user input to print the number of rows

        for (int i = 1; i <= rows; i++) {// implementing the condition
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");// print it on the left side
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");//printing the start patten and spacing between the stars
            }

            System.out.println();
        }

    }
}
