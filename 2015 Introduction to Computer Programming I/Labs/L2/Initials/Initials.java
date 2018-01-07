
import java.util.Scanner;
/**
 A program that reads in a first name, a middle name, and a last name,
 and then print out the three initials as a single string.
 For example, if the three input names are Joe, Mike, and Dave
 then the output should be JMD.
 */
public class Initials
{
     public static void main (String[] args)
   {
      // Display prompts for all three names
      System.out.println("Please enter first name, middle name, last name: ");

      // Read names
      Scanner in = new Scanner(System.in);
      String fName = in.next();
      String mName = in.next();
      String lName = in.next();
      
      //Print out initials
      String initials = fName.substring(0,1) + mName.substring(0,1) + lName.substring(0,1);
      
      System.out.print("Your initials are: " + initials);
      
      
    }
}
