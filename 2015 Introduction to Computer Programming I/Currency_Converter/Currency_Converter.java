/**
 *Justin Seda
 *This program is a currency converter.
 *Only does US Dollars, Euros, British Pounds and Japanese Yen.
 *The currencies may need to be updated.
 */
import java.util.*;
public class Currency_Converter
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        double dollars = 1;    
        double euros = 2;
        double pounds = 3;
        double yen = 4;
    
        final double DOLLARS_EUROS = 0.88634;
        final double DOLLARS_POUNDS = 0.65139;
        final double DOLLARS_YEN = 119.926;
        
        final double EUROS_DOLLARS = 1.12823;
        final double EUROS_POUNDS = 0.73490;
        final double EUROS_YEN = 135.302;
        
        final double POUNDS_DOLLARS = 1.53523;
        final double POUNDS_EUROS = 1.36071;
        final double POUNDS_YEN = 184.112;
        
        final double YEN_DOLLARS = 0.00834;
        final double YEN_EUROS = 0.00739;
        final double YEN_POUNDS = 0.00543136;
        
        System.out.println("Weclome to the Currency Converter Program");
        System.out.println("");
        System.out.println("Use the following codes to input your currency choices:");
        System.out.println("    1-US Dollars");
        System.out.println("    2-Euros") ;
        System.out.println("    3-British Pounds");
        System.out.println("    4-Japanese Yen");
        System.out.println("");
        
        System.out.print("Please choose the input currency>> ");
        if ( in.hasNextInt())
        {
            int inputCur = in.nextInt();//inputCur means input currency
            System.out.println("");
            if ( inputCur < 1 || inputCur > 4)
            {
                
                System.out.println("This input is invalid, please re-enter an integer from 1 to 4. ");
                
                System.out.println("");
                System.out.println("Thank you for using the Currency Converter Program!");
                System.exit(1);
            }
            else 
            {
                System.out.print("Now choose the ouput currency>> ");
            }
            
            if (in.hasNextInt())
            {
                int outputCur = in.nextInt();
                System.out.println("");
                 
                if ( outputCur < 1 || outputCur > 4)
                {
                    
                    System.out.println("This input is invalid, please re-enter an integer from 1 to 4. ");
                
                    System.out.println("");
                    System.out.println("Thank you for using the Currency Converter Program!");
                    System.exit(1);
                }       
                else 
                {
                }    
                if (inputCur == 1)
                {
                    dollars = inputCur;
                    System.out.print("Now enter the input in US Dollars>> $");
                    if (in.hasNextDouble())
                    {
                        double dPrice = in.nextDouble();
                        System.out.println("");
                    
                        if (outputCur == 1)
                        {
                            dollars = outputCur; 
                            System.out.print("No conversion is necessary.");
                            System.out.println("");
                        }
                        else if (outputCur == 2)
                        {
                            euros = outputCur;
                            euros = DOLLARS_EUROS * dPrice;
                            System.out.printf( "$%.2f US Dollars at a conversion rate of %.2f US Dollars to Euros = €%.2f Euros.", dPrice , DOLLARS_EUROS, euros);
                            System.out.println("");
                        }
                        else if (outputCur == 3)
                        {
                            pounds = outputCur;
                            pounds = DOLLARS_POUNDS * dPrice;
                            System.out.printf( "$%.2f US Dollars at a conversion rate of %.2f US Dollars to British Pounds =  £%.2f British Pounds.", dPrice , DOLLARS_POUNDS, pounds);
                            System.out.println("");
                        }     
                        else if (outputCur == 4)
                        {
                            yen = outputCur;
                            yen =  DOLLARS_YEN * dPrice;
                            System.out.printf( "$%.2f US Dollars at a conversion rate of %.2f US Dollars to Japanese Yen = ¥%.2f Japanese Yen.", dPrice , DOLLARS_YEN, yen);
                            System.out.println("");
                        }
                        else  
                        {
                          
                        }
                       }
                       else
                       {
                           System.out.println(""); 
                           System.out.println("Error, please re-enter an integer from 1 to 4.");
                           
                       }
                }
                else if (inputCur == 2)
                {
                    euros = inputCur;
                    System.out.print("Now enter the input in Euros>> €");
                    if (in.hasNextDouble())
                    {
                        double ePrice = in.nextDouble();
                        System.out.println("");
           
                        if (outputCur == 1)
                        {
                            dollars = outputCur;
                            dollars = ePrice / DOLLARS_EUROS;
                            System.out.printf( "€%.2f Euros at a conversion rate of %.2f Euros to US Dollars = $%.2f US Dollars.", ePrice , EUROS_DOLLARS, dollars);
                            System.out.println("");
                        }
                        else if (outputCur == 2)
                        {
                            euros = outputCur; 
                            System.out.print("No conversion is necessary.");
                            System.out.println("");  
                        }
                        else if (outputCur == 3)
                        {
                            pounds = outputCur;
                            dollars = ePrice / DOLLARS_EUROS;
                            pounds = dollars * DOLLARS_POUNDS;
                            System.out.printf( "€%.2f Euros at a conversion rate of %.2f Euros to British Pounds = £%.2f British Pounds.", ePrice , EUROS_POUNDS, pounds);
                            System.out.println("");
                        }
                        else if (outputCur == 4)
                        {
                            yen = outputCur;
                            dollars = ePrice / DOLLARS_EUROS;
                            yen = dollars *  DOLLARS_YEN;
                            System.out.printf( "€%.2f Euros at a conversion rate of %.2f Euros to Japanese Yen = ¥%.2f Japanese Yen.", ePrice ,  EUROS_YEN, yen);
                            System.out.println("");
                        }
                        else
                        {
                            
                        }
                     }
                     else
                     {
                          System.out.println(""); 
                          System.out.println("Error, please re-enter an integer from 1 to 4.");
                          
                     }
                }
                else if (inputCur == 3)
                {
                    pounds = inputCur;
                    System.out.print("Now enter the input in British Pounds>> £");
                    if (in.hasNextDouble())
                    {
                        double pPrice = in.nextDouble();
                        System.out.println("");
           
                        if (outputCur == 1)
                        {
                            dollars = outputCur;
                            dollars = pPrice / DOLLARS_POUNDS;
                            System.out.printf( "£%.2f British Pounds at a conversion rate of %.2f British Pounds to US Dollars = $%.2f US Dollars.", pPrice , POUNDS_DOLLARS, dollars);
                            System.out.println("");
                        }
                        else if (outputCur == 2)
                        {
                            euros = outputCur;
                            dollars = pPrice / DOLLARS_POUNDS;
                            euros = dollars * DOLLARS_EUROS;
                            System.out.printf( "£%.2f British Pounds at a conversion rate of %.2f British Pounds to Euros = €%.2f Euros.", pPrice , POUNDS_EUROS, euros);
                            System.out.println(""); 
                        }
                        else if (outputCur == 3)
                        {
                            pounds = outputCur; 
                            System.out.print("No conversion is necessary.");
                            System.out.println("");  
                        }
                        else if (outputCur == 4)
                        {
                            yen = outputCur;
                            dollars = pPrice / DOLLARS_POUNDS;
                            yen = dollars *  DOLLARS_YEN;
                            System.out.printf( "£%.2f British Pounds at a conversion rate of %.2f British Pounds to Japanese Yen = ¥%.2f Japanese Yen.", pPrice ,  POUNDS_YEN, yen);
                            System.out.println("");
                        }
                        else  
                        {
                           
                        }
                    }
                    else
                    {
                        System.out.println(""); 
                        System.out.println("Error, please re-enter an integer from 1 to 4.");
                        
                    }
                }
                else if (inputCur == 4)
                {
                    yen = inputCur;
                    System.out.print("Now enter the input in Japanese Yen>> ¥");
                    if (in.hasNextDouble())
                    {
                        double yPrice = in.nextDouble();
                        System.out.println("");
                        if (outputCur == 1)
                        {
                            dollars = outputCur;
                            dollars = yPrice /  DOLLARS_YEN;
                            System.out.printf( "¥%.2f Japanese Yen at a conversion rate of %.2f Japanese Yen to US Dollars = $%.2f US Dollars.", yPrice ,  YEN_DOLLARS, dollars);
                            System.out.println(""); 
                        } 
                        else if (outputCur == 2)
                        {
                            euros = outputCur;
                            dollars = yPrice /  DOLLARS_YEN;
                            euros = dollars * DOLLARS_EUROS;
                            System.out.printf( "¥%.2f Japanese Yen at a conversion rate of %.2f Japanese Yen to Euros = €%.2f Euros.", yPrice , YEN_EUROS, euros);
                            System.out.println(""); 
                        }
                        else if (outputCur == 3)
                        {
                            pounds = outputCur;
                            dollars = yPrice /  DOLLARS_YEN;
                            yen = dollars * DOLLARS_POUNDS;
                            System.out.printf( "¥%.2f Japanese Yen at a conversion rate of %.2f Japanese Yen to British Pounds = £%.2f British Pounds.", yPrice , YEN_POUNDS, yen);
                            System.out.println("");
                        }
                        else if (outputCur == 4)
                        {
                            yen = outputCur; 
                            System.out.print("No conversion is necessary.");
                            System.out.println("");  
                        }
                        else
                        {
                           
                        }
                    }
                    else
                    {
                         System.out.println(""); 
                         System.out.println("Error, please re-enter an integer from 1 to 4.");
                         
                    }
                }
                else 
                {
                }   
                
            }
            else
            {
                 System.out.println(""); 
                 System.out.println("Error, please re-enter an integer from 1 to 4.");
                
            }
        }
        else
        {
            System.out.println(""); 
            System.out.println("Error, please re-enter an integer from 1 to 4.");
           
        }
        
        System.out.println("");
        System.out.println("Thank you for using the Currency Converter Program!");
        System.exit(1);
       }
     }   
    
     

