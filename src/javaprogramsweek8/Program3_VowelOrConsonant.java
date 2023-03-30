package javaprogramsweek8;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
import java.util.Scanner;//importing scanner
public class Program3_VowelOrConsonant {//class

    public static void main(String[] args) {//main method
    Program3_VowelOrConsonant obj=new Program3_VowelOrConsonant();//created object of instance method
    obj.checkVowelOrConsonant();//calling the instance method
    }

    public void checkVowelOrConsonant(){//instance method
        //implementing the condition
        int i=0;
        Scanner sca=new Scanner(System.in);//scanner declaration for reading input from console
        System.out.println("Please enter a single Character: ");
        char ch= sca.next().charAt(0);//assigning the values to variables
        //implementing condition
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                i++;
        }
        if (i == 1){
            System.out.println("Entered character " + ch + " is Vowel");
        } else if ((ch>='a' && ch <='z') || (ch >= 'A' && ch<= 'Z')) {
            System.out.println("Entered character " + ch + " is Consonant");
        } else {
            System.out.println("Entered value is not an alphabet invalid input");
        }
        sca.close();//closing scanner
    }
}
