
/**
 * Justin Seda
 The program reads in a temperature in degrees that is in Fahenheit or Celsius. The second input value is "F" for Fahrenheit or "C" for Celsius.
 If it's "F", then the temperature read was Farhenheit, so the program converts it to Celsius.
 If it's an "C", the temperature read was Celsius, so the program converts it to Fahrenheit.
 */
import java.util.*;
public class Temperature
{
   public static void main (String[] args)
   {
     final double FAH_FORM = (9 / 5.0); 
     final double FAH_FORM2 = 32.0;
     final double CELSIUS_FORM = (5 / 9.0);
     final double CELSIUS_FORM2 = 32.0;
   
     System.out.print("Please enter the temperature in degrees: ");
     Scanner in = new Scanner(System.in);
     double temp = in.nextDouble();
     System.out.println("");
     
     System.out.print("Enter F for Fahrenheit or C for Celsius: ");
     String type  = in.next();
     System.out.println("");
     
     if (type.equals("F"))
     {
       temp = (CELSIUS_FORM) * (temp - CELSIUS_FORM2);
       System.out.printf(" The temperature from Fahrenheit to Celsius is %.2f", temp);
     }
     else if (type.equals("C"))
     {
        temp = (FAH_FORM) * temp + FAH_FORM2;
        System.out.printf("The temperature from Celsius to Fahrenheit is %.2f", temp);
     }
     else
     {
        System.out.print("Error, please enter F or C");
        
     }
     
     System.out.println("");
    }
}