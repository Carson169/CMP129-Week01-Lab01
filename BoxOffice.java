import java.util.*;
public class BoxOffice 
{
    public static void main(String[] args) 
    {
            Scanner FunnyScanner = new Scanner(System.in);
            System.out.println("Whats the name of the movie: ");
            String movie = FunnyScanner.nextLine();
            System.out.println("How many adult tickets were sold: ");
            Double adult = FunnyScanner.nextDouble();
            System.out.println("How many child tickets were sold: ");
            Double child = FunnyScanner.nextDouble();
            System.out.println("Movie Name:                                   " + movie);
            System.out.println("Adult Tickets Sold:                           " + adult);
            System.out.println("Child Tickets Sold:                           " + child);
            System.out.println("Gross Box Office Profit:                    $ " + ((adult * 10) + (child * 6)));
            System.out.println("Net Box Office Profit:                      $ " + (((adult * 10) + (child * 6)) * 0.20));
            System.out.println("Amount Paid to Distributor:                 $ " + (((adult * 10) + (child * 6)) * 0.80));
    }    
}
