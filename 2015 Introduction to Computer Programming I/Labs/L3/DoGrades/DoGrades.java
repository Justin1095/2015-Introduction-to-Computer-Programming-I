
/**
 * Justin Seda
 * This program ask the user for a final class average then output their final letter grade 
 */
import java.util.*;
public class DoGrades
{
   public static void main(String[] args)
   {
       System.out.print("Enter final class average: ");
       Scanner in = new Scanner(System.in);
       double average =  in.nextDouble();
       System.out.println("");
       
       if (average >= 101.0)
       {
           System.out.println( "Error, invalid input");
       }    
       else if (average > 90.0 && average <= 100.0)
        {
           System.out.println( "Your final grade is an A");
        }
        else if (average > 80.0 && average <= 90.0)
        {
            System.out.println( "Your final grade is a B"); 
        }
        else if (average > 70.0 && average <= 80.0)
        {
             System.out.println( "Your final grade is a C");
        }
        else if (average > 60 && average <= 70.0)
        {
             System.out.println( "Your final grade is a D");
        }
        else 
        {
             System.out.println( "Your final grade is a F");
        }
    
    
}    
}
