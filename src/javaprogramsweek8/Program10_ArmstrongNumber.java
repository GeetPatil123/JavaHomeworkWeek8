package javaprogramsweek8;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 * examples 153,370,371,407 etc.
 */

public class Program10_ArmstrongNumber {//class

    public static void main(String[] args) {//main method
    Program10_ArmstrongNumber obj=new Program10_ArmstrongNumber();//created object to instance method
    obj.checkArmstrongNumberOrNot();//calling instance method
    }

    public void checkArmstrongNumberOrNot(){//instance method
        //declaration og scanner to read the user input
        Scanner sca=new Scanner(System.in);
        System.out.println("Please a  number: ");
        //assigning values to the variables
        int num=sca.nextInt();
        int result=0, rem, temp=num;
        //implementing condition
        while (num>0){
            rem=num%10; //153%10=3, 15%10=5, 1%10=1
            num=num/10; //153/10=15, 15/10=1, 1/10=0

            result=result+(rem*rem*rem); //0+(3*3*3)=27, 27+(5*5*5)=152, 152+(1*1*1)=153
        }
        if(result == temp){
            System.out.println("It is a Armstrong number");
        } else {
            System.out.println("Its is not Armstrong number");
        }
        sca.close();//closing scanner
    }













}
