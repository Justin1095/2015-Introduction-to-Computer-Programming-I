/**
 * Justin Seda
 * This program ask for the principal, interest rate and term then it outputs each month, the interest and the principal.
 * Afterwards, it outputs the starting balance, final account balance and total interest paid.
 * Example: 200 5 5 years 
 */
import java.util.*;
public class AccountCalculator
{
    public static void main(String[] arags)
    {
        double princ = 0; //princ means principal 
        double rate = 0;
        double term = 0;
        double finalPrinc = 0;
        double oldPrinc = 0;
        double interest = 0;
        double totalInterest = 0;
        boolean validInputs = false;
        String term2 = "";

        Scanner in = new Scanner(System.in);
        System.out.println("Weclome to the Account Interest Calculator");
        System.out.println("");
        System.out.print("Please input the following: principal, interest rate, term >> ");
        while(!validInputs)
        {
            if(in.hasNextDouble())
            {
                princ = in.nextDouble();
            }
            else
            {
                in.next();
                princ = 0;
            }

            if (in.hasNextDouble())
            {
                rate = in.nextDouble();
            }
            else
            {
                in.next();
                rate = 0;
            }

            if (in.hasNextDouble())
            {
                term = in.nextDouble();
            }
            else
            {
                in.next(); 
                term = 0;
            }

            if (!in.hasNextDouble())
            {
                term2 = in.next();   
            }    
            else
            {
                in.next();
                term2 =("");
            }
            term2 = term2.toUpperCase();

            if(princ > 0 && rate > 0 && term > 0 &&(term2.equals("MONTHS") || term2.equals("YEARS")))
            {
                System.out.println("");
                validInputs = true;
                if(term2.equals("MONTHS"))
                {
                    term = term;
                }
                else 
                {
                    term = term * 12;
                }
            }
            else
            {
                validInputs = false;
                System.out.println("Error");
                System.out.println("Re-enter input.");
                System.out.print("Please input the following: principal, interest rate, term >> ");

            }
        }
        rate = rate / 100;
        finalPrinc = princ * Math.pow((1.0 + (rate / 12.0)),term);
        totalInterest = finalPrinc - princ;
        oldPrinc = princ;

        System.out.println("");
        System.out.println("");
        System.out.println("Months: \t Interest: \t Principal:");

        for (int i = 0; i <= term; i++)
        {  
            if(i != 0)
            {
                System.out.printf("%d \t \t $%-10.2f \t $%.2f \n", i , interest, princ);
            }
            interest = princ * rate / 12;
            princ = princ + interest; 
        }
        System.out.println("");
        System.out.println("");
        System.out.printf("Starting Balance \t = $ %.2f", oldPrinc);
        System.out.println("");
        System.out.printf("Final Account Balance \t = $ %.2f", finalPrinc);
        System.out.println("");
        System.out.printf("Total Interest Paid \t = $ % .2f", totalInterest);
        System.out.println("");
        System.out.println("");
        System.out.println("Thank you for using the Account Interest Calculator!");

    }    
}
