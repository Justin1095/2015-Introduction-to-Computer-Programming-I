import java.util.Scanner;
/**
  A program that reads in a temperature in degrees Fahenheit
  and converts it to the equivalent temperature in Celsius
  and also the equivalent temperature in Kelvin.
  For example, if the input is F = 68.0 degrees Fahrenheit,
  then the conversions should show that C = 20.0 degrees Celsius
  and K = 293.0 degrees Kelvin.
 */
public class ConvertTemp
{
    public static void main (String[] args)
    {
      //Define constants
      final double CELSIUS_FORM = (5.0 / 9); //CELSIUS_FORM means celsius formula
      final double CELSIUS_FORM_2 = 32.0;
      final double KELVIN_FORM = 273.0; // KELVIN_FORM means kelvin formula
        
      //Display prompt for temperature in degrees Farhenheit
      System.out.print("Please enter the temperature"); 
      System.out.print(" in degrees Fahrenheit: ");
      
      //Read Fahrenheit temperature
      Scanner in = new Scanner(System.in);
      double fahrenheit = in.nextDouble();
      
      //Compute Celsius and Kelvin equivalents
      double celsius = (CELSIUS_FORM)*(fahrenheit - CELSIUS_FORM_2);
      
      double kelvin = celsius + KELVIN_FORM;
      
      //Print out equivalents
      System.out.println(celsius);
      System.out.println(kelvin);
      
    }
}
