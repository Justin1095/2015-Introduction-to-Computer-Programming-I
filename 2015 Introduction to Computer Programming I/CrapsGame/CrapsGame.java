
/**
 *Justin Seda
 *This program simulates a craps game.
 */
import java.util.*;
import javax.swing.JOptionPane;
public class CrapsGame
{
    public static void main(String[] arags)
    {
         Scanner in = new Scanner(System.in);
         System.out.println("Welcome to Craps!");
         System.out.println("");
       
         int games = 1;
         int wins = 0;
         int loses = 0;
         double perWins = 0; // Percentage wins
         double perLoses = 0; // Percentage loses
         boolean anotherGame = false;
         String letter;
         double change = 0; 
       
         double getBal = balance(); // bal = balance
         double originBal = getBal;
         while( !anotherGame )
         {
             double getBet = bet(getBal); 
             System.out.println("");
             System.out.printf("Game #" + games + " starting with bet of: $%.2f", getBet);
             System.out.println("");
             int diceSum = diceRolls(); 
             boolean roll = false;
             if (diceSum == 7 || diceSum == 11)
             {
                 System.out.println("Player rolls: " + diceSum );
                 System.out.println("Player wins :-^) ! ");
                 getBal = getBal + getBet;
                 wins++;
                }
                else if ( diceSum == 2 || diceSum == 3 || diceSum == 12)
                {
                    System.out.println("Player rolls: " + diceSum );
                    System.out.println("Player loses :-((");
                    getBal = getBal - getBet;
                    loses++;
                }
                else 
                {
                    int initialRoll = diceSum;
                   String mustRollAgain =" --must roll " + initialRoll +" again to win.";
                    while (!roll)
                    {
                        System.out.println("Player rolls: " + diceSum + mustRollAgain);
                        mustRollAgain = "";
                        diceSum = diceRolls();
                        if (initialRoll == diceSum)
                        {
                            System.out.println("Player rolls: " + diceSum );
                            System.out.println("Player wins :-^) !");
                            getBal = getBal + getBet;
                            wins++;
                            roll = true;
                        }
                        else if (diceSum == 7)
                        {
                            System.out.println("Player rolls: " + diceSum); 
                            System.out.println("Player loses :-((");
                            getBal = getBal - getBet;
                            loses++;
                            roll = true;
                        }
                    }
                }
             System.out.printf("Your account balance is now: $%.2f", getBal );
             System.out.println("");
              perWins = (((double) wins) / games ) * 100.0;
              perLoses = (((double)loses) / games) * 100.0;
               change = originBal - getBal;
             if ( getBal == 0)
             {
                 System.out.println("");
                 System.out.println("Sadly, you are no longer eligible to play.");
                 System.out.printf("Your ending account balance is: $%.2f", getBal );
                 System.out.println("");
                 System.out.println("Your starting balance has decreased by $" + change + "0 (-100.0%).");
                 System.out.printf("Out of " + games + " game(s) played, you won " + wins + " game(s)(%.1f%%) and lost " + loses + " game(s)(%.1f%%)." , perWins, perLoses);
                 System.out.println("");
                 System.out.println("");
                 System.out.print("Buh, bye – Get more $$ and play again soon!");
                 anotherGame = true;  
             }
             else
             { 
                 System.out.println("");
                 System.out.print("Do you wish to play another game (n for no or any other key to continue)?");
                 letter = in.next();
                 letter = letter.toUpperCase();
                 if (letter.equals("N"))
                 {
                     System.out.println("");
                     System.out.println("Thank you for playing Craps!");
                     System.out.printf("Your ending account balance is: $%.2f", getBal );
                     System.out.println("");
                      double perc = Math.abs(((double) originBal - getBal) / originBal) * 100.0;
                     if(getBal == originBal)
                     {
                        System.out.println("Your starting balance has not changed (0%).");
                     }
                     else if (getBal < originBal)
                     {
                          System.out.printf("Your starting balance has decreased by $%.2f (%.1f%%)." ,change, perc );
                          System.out.println("");
                     }
                     else
                     {
                         double change2 = getBal - originBal;
                         System.out.printf("Your starting balance has increased by $%.2f (%.1f%%).", change2, perc ); 
                         System.out.println("");
                     }
                     System.out.printf("Out of " + games + " game(s) played, you won " + wins + " game(s)(%.1f%%) and lost " + loses + " game(s)(%.1f%%)." , perWins, perLoses);
                     System.out.println("");
                     System.out.println("");
                     System.out.println("Please come again!");
                     anotherGame = true; 
                 }
                 else
                 {
                     games++;
                 }
                }
            }
    }
    
    public static double balance()
    {
        int bal = 0;       
        boolean validInput = false;
        Scanner in = new Scanner(System.in);
        while(!validInput)
        { 
            System.out.print("Please input your balance for the game>> $");       
           if (in.hasNextInt())
           {
               bal = in.nextInt();
                if ( bal >= 5)
               {
                  validInput = true;
               }
               else 
               {
                  System.out.println("Invalid balance- Your balance needs to be greater than or equal to $5." );
               }
           } 
            else 
            {
               System.out.println("Invalid balance- Please input an integer." );
               in.next();
               in.nextLine();
            }
            }
             return bal; 
       }   
    
    public static double bet(double getBal)
    {
        int bet = 0;
        boolean validInput = false;
        Scanner in = new Scanner(System.in);
        while(!validInput)
        {
            System.out.print("Please input your bet for the game>> $");
            if (in.hasNextInt())
            {
               bet = in.nextInt();
               if ( bet <= 0)
               {
                    System.out.println("Invalid bet- Your bet needs to be greater than or equal to $1.");
               }
                else if ( bet > getBal)              
                {
                    System.out.printf("Invalid bet- Your balance is only: $%.2f", getBal); 
                    System.out.println("");
                }
                else
                {
                    validInput = true;
                }               
            }
            else 
            {
                System.out.println("Invalid bet- Please input an integer." );
                in.next();
                in.nextLine();
            }
        }
        return bet;
    }    
    
    public static int diceRolls()
    {
        int dice1 = (int) (1 + ( 6.0* Math.random()));
        int dice2 = (int)(1 + ( 6.0 * Math.random()));
        int diceSum = dice1 +dice2;
        JOptionPane.showMessageDialog(null, "Player rolls: " + diceSum);
        return diceSum; 
    }    
}
        