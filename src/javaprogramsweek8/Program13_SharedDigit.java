package javaprogramsweek8;

/**
 * 13. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */
public class Program13_SharedDigit {//class
    public static void main(String[] args) {//main class
        // Checks if 12 and 23 shared a digit.
        System.out.println(hasSharedDigit(12, 23));

        // Checks if 9 and 99 shared a digit.
        System.out.println(hasSharedDigit(9, 99));

        // Checks if 15 and 55 shared a digit.
        System.out.println(hasSharedDigit(15, 55));
    }

    //Checks if two numbers have shared a digit.
    public static boolean hasSharedDigit(int a, int b) {//static method
        // Checks for invalid value.
        if ((a < 10) || (b < 10) || (a > 99) || (b > 99)) {
            return false;
        }
        // Stores the last digit of var. a.
        int lastDigitA = a % 10;
        a /= 10;

        // Stores the first digit of var. a.
        int firstDigitA = a % 10;

        // Stores the last digit of var. b.
        int lastDigitB = b % 10;
        b /= 10;

        // Stores the first digit of var. b.
        int firstDigitB = b % 10;

        return ((lastDigitA == firstDigitB) || (lastDigitA == lastDigitB) || (firstDigitA == firstDigitB)
                || (firstDigitA == lastDigitB));

    }
}

