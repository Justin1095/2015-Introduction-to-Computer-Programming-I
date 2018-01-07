/**
 * Justin Seda
 * You are given 100 cents. The program ask how much is your item then it will output the change in quarters,
 * dimes, nickels and pennies.
 */
import java.util.*;
public class ChangeMaker
{
     public static void main(String[] args)
   {
     Scanner scanObj = new Scanner(System.in);
      
     System.out.print("How much is your item (in cents)?>>");
     int price = scanObj.nextInt();
     
     final int MONEY = 100;
     int change = MONEY - price;
      
     int numQuarters = change/25;
     int rchange = change%25;
      
     int numDimes = rchange/10;
     int rchangeTwo = rchange%10;
       
     int numNickels = rchangeTwo/5;
     int rchangeThree = rchangeTwo%5;
      
     int numPennies = rchangeThree%5;
     
     System.out.println("Your change is ");
     System.out.println("Quarters:" + numQuarters);
     System.out.println("Dimes:" + numDimes);
     System.out.println("Nickels:" + numNickels);
     System.out.println("Pennies:" + numPennies);       
    }
}
