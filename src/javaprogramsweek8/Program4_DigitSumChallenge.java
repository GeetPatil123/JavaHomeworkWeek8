package javaprogramsweek8;

/**
 * 4. Digit Sum Challenge
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working
 * correctly for valid and invalid values passed as arguments.
 * Hint: Use n % 10 to extract the least-significant digit.
 * Use n = n / 10 to discard the least-significant digit.
 * The method needs to be static
 * Create a class with the name DigitSumChallenge
 */
public class Program4_DigitSumChallenge {//class

    public static void main(String[] args) {//main class
        System.out.println("Sum of 125 is = " + sumDigits(125));
        System.out.println("Sum of 854 is = " + sumDigits(854));
        System.out.println("Sum of 18 is = " + sumDigits(18));
        System.out.println("Sum of -3 is = " + sumDigits(-3));
    }

    public static int sumDigits(int number){//instance method
        //implementing condition
        if (number < 10){
            return -1;
        }
        int sumDigits = 0;
        //convert number to string
        String numberToString=Integer.toString(number);
        //map through all char of string
        for (char ch : numberToString.toCharArray() ){
            //convert the char to number again
            sumDigits +=Integer.parseInt(String.valueOf(ch));
        }
        return sumDigits;//returning the sum of digits
    }


}
