
/**
 *Justin Seda
 *This program ckecks if the string is a palindrome or not.
 */
import java.util.*;
public class PalFind
{
     public static void main(String[] args)
  {
      Scanner in = new Scanner (System.in);
      System.out.print("Please input a string>> ");
      String ins = in.nextLine();
      ins = ins.toLowerCase();
      
      int length = ins.length();
      int i;
      int begin = 0;
      int end = length - 1;
      int mid = (begin + end) / 2;
      
      for (i = begin; i <= mid; i++)
      {
          if (ins.charAt(begin) == ins.charAt(end))
          {
              begin++;
              end--;
            }
            else 
            {
                break;
            }
        }
       if (i == mid + 1)
       {
            System.out.println("Yes");
        }
        else 
        {
            System.out.println("No");
        }
    }
}
