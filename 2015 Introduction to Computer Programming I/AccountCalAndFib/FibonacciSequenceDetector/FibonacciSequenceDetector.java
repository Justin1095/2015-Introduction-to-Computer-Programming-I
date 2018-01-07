/**
 *Justin Seda
 *This program ask for a number and finds out what position it is in the fibonacci sequence.
 *The fibonacci sequence: 0, 1, 1, 2, 5, 8, 13, 21, 34, 55, 89, 144,...
 *Ex. Input 1, it will output 2 and 3.
 *Input a letter to end the program.
 */
import java.util.*;
public class FibonacciSequenceDetector
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       int first = 0;
       int sec = 1;
       int sum = -1;
       int input = 0;
       int count = 0;
       int sum2 = 0;
      
       System.out.println("Welcome to the Fibonacci Sequence Detector ");
      
     while(true)
       { 
           first = 0;
           sec = 1;
           sum = -1;
           input = 0;
           count = 0;
           sum2 = 0; 
           
         System.out.println("");
         System.out.println("");
         System.out.print("Please input a number for analysis >> "); 
       if(in.hasNextInt()) 
       {
           input = in.nextInt();
        while(sum <= input)
        {
            count++;
            sum = first + sec;
            first = sec;
            sec = sum;
        }
       if (input == 0)
        {
             System.out.print(input + " is a Fibonacci number whose order in the sequence is 1");
        }
        else if (input == 1)
        {
             System.out.print(input + " is a Fibonacci number whose order in the sequence is both 2 and 3");
        }
        else if (input < 0)
        {
            System.out.print("A negative number is not part of the Fibonacci Sequence");
        }
        else if ( input == first)
        {
            System.out.print(input + " is a Fibonacci number whose order in the sequence is " + (count + 1));  
        }    
        else if (input != first)
        {
            sum2 = sum - first;
            sum2 = sec - sum2;
            System.out.println(input + " is a not a Fibonacci number");
            System.out.print("However, it lies between Fibonacci numbers " + sum2 + "(order: " + (count + 1) + ") and "+ sum + "(order: " + (count + 2) + ")");
        }   
      } 
      else
      {
          System.out.println("");
          System.out.println("");
          System.out.print("Thank You for Using the Fibonacci Sequence Detector");
          System.out.println("");
          break;
      }
     }
  } 
}

