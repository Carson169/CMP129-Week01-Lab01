//Carson Samples
//Lab Assignment 1
//9.4.26
//Course CMP-129-80231
import java.util.*;
public class BoxOffice 
{
    public static void main(String[] args) 
    {
            Scanner FunnyScanner = new Scanner(System.in); //initalizing scanner
            System.out.println("Whats the name of the movie: "); //prompting user for name of movie
            String movie = FunnyScanner.nextLine(); //setting movie variable to the name of the movie
            System.out.println("How many adult tickets were sold: "); //prompting user for amount of adult tickets sold
            Double adult = FunnyScanner.nextDouble(); //setting adult variable to the amount of adult tickets sold
            System.out.println("How many child tickets were sold: "); //prompting user for amount of child tickets
            Double child = FunnyScanner.nextDouble(); //setting child variable to the amount of child tickets
            Double gross = ((adult * 10) + (child * 6)); //calculating gross box office profit
            Double box = (((adult * 10) + (child * 6)) * 0.20); //calculating net box office profit
            Double distrib = (((adult * 10) + (child * 6)) * 0.80); //calculating amount paid to distributor
            System.out.println("Movie Name: " + movie); //displaying movie name
            System.out.printf("Adult Tickets Sold: %.0f\n" , adult); //displaying adult tickets sold
            System.out.printf("Child Tickets Sold: %.0f\n" , child); //displaying child tickets sold
            System.out.printf("Gross Box Office Profit: $%.2f\n" , gross); //calculating gross box office profit
            System.out.printf("Net Box Office Profit: $%.2f\n" , box); //calculating net box office profit
            System.out.printf("Amount Paid to Distributor: $%.2f\n" , distrib); //calculating amount paid to distributor
            FunnyScanner.close(); //closing scanner to prevent memories leak
    }    
}
