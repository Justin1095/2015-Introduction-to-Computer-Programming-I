
/**
 * Justin Seda
 * This program counts the number of vowels in a string 
 */
import java.util.*;
public class CountVowels
{
   public  static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       System.out.print("Please input a string>> ");
       String s = in.nextLine();
       s = s.toUpperCase();
       
       int vowel = 0;
       
       for(int i = 0; i < s.length(); i++)
       {
           char ch = s.charAt(i);
           if(ch == 'A') 
           {
              vowel++;
            }
            else if (ch == 'E')
            {
              vowel++;
            }
            else if (ch == 'I')
            {
                vowel++;
            }
            else if (ch == 'O')
            {
                vowel++;
            }
            else if (ch == 'U')
            {
                vowel++;
            }
       } 
       s = s.toLowerCase();
       System.out.println("The number of all the vowels in " + s + " : " + vowel + ".");
    }
} 
