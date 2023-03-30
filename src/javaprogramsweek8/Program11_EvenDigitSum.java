package javaprogramsweek8;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */
public class Program11_EvenDigitSum {//class
    public static void main(String[] args) {//main method
        //printing output using print statement
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {//static method
        //assigning values to the variables
        int originalNumber = number;
        int lastDigit;
        int sumOfEvenDigits = 0;
        //implementing condition
        if (number >= 0) {

            while (number > 0) {
                lastDigit = number % 10;
                if (number % 2 == 0) {
                    sumOfEvenDigits += lastDigit;
                }
                number /= 10;
            }
            if (originalNumber >= 0) {
                System.out.println("The sum of even digits within a number " + originalNumber + " is equal to: ");
            }
            return sumOfEvenDigits;

        }
        System.out.println("Invalid Number");
        return -1;
    }
}