//Carson Samples
//Lab Assignment 1
//9.4.26
//Course CMP-129-80231
import java.util.*;
public class InterestEarned 
{
    public static void main(String[] args) 
    {
        Scanner FunnyScanner2 = new Scanner(System.in); //initializing scanner
        System.out.println("What is the principal amount: "); //asking for principal amount
        Double prince = FunnyScanner2.nextDouble(); //setting variable to principal amount input
        System.out.println("What is the annual interest rate: "); //asking for annual interest rate
        Double rate = FunnyScanner2.nextDouble(); //setting variable to annual interest rate input
        System.out.println("How many times is the interest compounded per year: "); //asking for compound amount
        Double year = FunnyScanner2.nextDouble(); //setting variable to compound amount
        Double finalsavings = prince * Math.pow((1 + rate / year), year); //calculating the final savings amount
        Double earned = finalsavings - prince; //calculating the total interest earned
        System.out.println("Annual Interest Rate: " + rate*100 +"%"); //displaying interest rate
        System.out.printf("Times Compounded: %.0f\n" , year); //displaying compound amount
        System.out.printf("Principal: $%.2f\n" , prince); //displaying principal
        System.out.printf("Interest Earned: $%.2f\n" , earned); //displaying interest earned
        System.out.printf("Amount in Savings: $%.2f\n" , finalsavings); //displaying amount in savings
        FunnyScanner2.close(); //closing scanner to prevent memory leak
    }
}
