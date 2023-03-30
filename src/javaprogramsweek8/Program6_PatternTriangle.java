package javaprogramsweek8;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
import java.util.Scanner;//imported scanner to use scanner
public class Program6_PatternTriangle {//class

    public static void main(String[] args) {//main method
        Program6_PatternTriangle obj=new Program6_PatternTriangle();//created object to instance method
        obj.patternTriangle();//calling instance method
    }
    // declaration of the instance method
    public void patternTriangle(){

        System.out.println("Enter thw number of rows: ");
        Scanner sca=new Scanner(System.in);//scanner declaration for reading input from console
        int no= sca.nextInt();//assigning the user input number to a variable
        //implementing conditions
        for(int i=1; i<=no; i++){
            for(int j=1; j<=i; j++)

                System.out.print(j);
                System.out.println("");
        }
        sca.close();//closing the scanner object
    }
}
