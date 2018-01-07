
/**
 * Justin Seda
 * This program ask for a string then outputs the string's length, the first character, last character,
 * middle character, transpose, and the string upper cased.
 * 
 */
import java.util.*;
public class String_fun
{
    public static void main (String[] arags)
    {
        Scanner scanObj = new Scanner(System.in);
        System.out.print("Please input a string:>>");
        String string = scanObj.next();
        
        int n = string.length();
        char first = string.charAt(0);
        char last = string.charAt(n-1);
        char middle = string.charAt(n/2);
         
        String sub = string.substring(0,n/2);
        String sub2 = string.substring(n/2,n);
        
        String changeCase = string;
       
        String result = changeCase.toUpperCase();
        
        System.out.println("");
        System.out.println("Program Output: ");
        System.out.println(" String length is: " + string.length());
        System.out.println(" Frist char is: " + string.charAt(0));
        System.out.println(" Last char is: " + string.charAt(n-1));
        System.out.println(" Middle char at position " + (n/2) + " is: " + string.charAt(n/2));
        System.out.println("  Transpose: " + sub2 + sub );
        System.out.println(" Upper Case: " + result );
      
    }
}
