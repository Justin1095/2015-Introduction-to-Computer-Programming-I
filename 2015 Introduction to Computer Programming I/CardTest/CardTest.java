/**
 *Created a program in Java that will accept, validate and process a series of coded playing cards in 
 * a file. THe cards are coded as RANK-SUIT
 * RANK- type of card such as Ace 
 * SUIT- suit of each card such as spades
 * 
 */
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;

public class CardTest
{
    static int valCount = 0;
    static int invalDel = 0;
    static  int invalRank = 0;
    static int invalSuit = 0;
    static int unrecog = 0;
    static File output;
    static PrintWriter o;
    static String fileName;

    public static void main(String[] args) throws FileNotFoundException
    {
        try
        {
            output = new File("output.txt");
            o = new PrintWriter(output);

            int num = 0;
            boolean file =true;
            Scanner kb = new Scanner(System.in);
            System.out.println("Please enter the file name:");
            fileName = kb.next();
            Scanner in = null;

            while(file)
            {
                try
                {
                    FileReader fr = new FileReader(fileName);
                    in = new Scanner(fr);
                    file = false;
                }
                catch ( FileNotFoundException e)
                {
                    // o.println("Error, this file is non-existent.");
                    JFileChooser chooser = new JFileChooser();
                    in = null;
                    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
                    {
                        File selectedFile = chooser.getSelectedFile();
                        in = new Scanner(selectedFile);
                        fileName = selectedFile.getName();
                        //Cards(in, fileName.substring(0, fileName.indexOf('.')));
                    } 
                }
                finally 
                {
                    file = false;
                }        
            }
            //  o.println("");
            Cards(in,  fileName.substring(0, fileName.indexOf('.')));
            o.close();
        }
        catch( Exception e)
        {
        }

    }   

    public static boolean Validate(String f, PrintWriter writer)
    {            
        f = f.toLowerCase();
        int rankNum  = 0;

        if(f.indexOf('-') == -1)
        {
            o.println("Card delimiter is invalid in " + f);
            invalDel++;
            return false;
        }
        if(f.indexOf('-') == 0)
        {
            o.println("Card rank is invalid in " + f);
            invalRank++;
            return false;
        }

        String rank = f.substring(0, f.indexOf('-'));
        if (Character.isDigit(rank.charAt(0)))
        {            
            try
            {
                rankNum = Integer.parseInt(rank);
            }
            catch (Exception e)
            {
                o.println("Card rank is invalid in " + f);
                invalRank++;
                return false;
            }
            if(rankNum <= 1 || rankNum >= 11)
            {
                o.println("Card rank is invalid in " + f);
                invalRank++;
                return false;
            }           
        }
        else 
        {
            char rankC = rank.charAt(0);
            if(rankC != 'j' && rankC != 'a' && rankC != 'q' && rankC != 'k')
            {
                o.println("Card rank is invalid in " + f);
                invalRank++;
                return false;
            }
        }

        char suit = f.charAt(f.length()-1);
        if (f.length() >= 5)
        {
            o.println("Card suit is invalid in " + f);
            invalSuit++;
            return false;
        }
        if(suit !='c' && suit != 'd' && suit != 'h' && suit != 's')
        {
            o.println("Card suit is invalid in " + f);
            invalSuit++;
            return false;
        }

        return true;
    }

    
    public static void Cards(Scanner in, String filename) throws FileNotFoundException
    {
        PrintWriter writer = new PrintWriter(filename + "-out.txt");
        String end = "";
        String replace = "";

        while (in.hasNext())
        {   
            String f = in.next();
            if(Validate(f, writer))
            {
                f = f.toLowerCase();
                int loc = f.indexOf('-');
                String rank = f.substring(0, loc);
                char suit = f.charAt(f.length() - 1);
                end = "";
                replace = "";
                if (Character.isDigit(rank.charAt(0)))
                {
                    int rankNum = Integer.parseInt(rank);
                    replace += rankNum;
                    switch(rankNum)
                    {
                        case 2: end += "Two" ;
                        break;
                        case 3: end += "Three";
                        break;
                        case 4: end += "Four";
                        break;
                        case 5: end += "Five";
                        break;
                        case 6: end += "Six";
                        break;
                        case 7: end += "Seven";
                        break;
                        case 8: end += "Eight";
                        break;
                        case 9: end += "Nine";
                        break;
                        case 10: end += "Ten";
                        break;
                    }
                }
                else 
                {
                    char rankNum = rank.charAt(0);
                    switch(rankNum)
                    {
                        case 'j': end += "Jack";
                        break;
                        case 'q': end += "Queen";
                        break;
                        case 'k': end += "King";
                        break;
                        case 'a': end += "Ace";
                        break;
                    }

                    if(rankNum == 'a')
                    {
                        replace += "1 or 11";                 
                    }
                    else
                    {
                        replace += "10";
                    }
                }
                end = end + " of ";
                switch(suit)
                {
                    case 'c': end += "Clubs";
                    break;
                    case 'd': end += "Diamonds";
                    break;
                    case 'h': end += "Hearts";
                    break;
                    case 's': end += "Spades";
                    break;
                }
                valCount++;
                o.println(end + " - Value = " + replace); 
            }
        } 
        
        Summary(valCount);
        o.close();
    }

    public static void Summary( int valCount )
    {     
        o.println("");
        o.println("--------------- Summary Report ---------------");
        //o.println("Path: E:\\Java\\CPSC 130\\Assignment #5\\" + fileName);
        o.println("Valid card count = " + valCount); 
        o.println("Invalid Rank card count = " + invalRank);
        o.println("Invalid Suit card count = " + invalSuit );
        o.println("Invalid Delimiter card count = " + invalDel);
        o.println("Unrecognized Entry card count = " + unrecog );
        o.println("Total card count = " + (valCount + invalRank + invalSuit + invalDel));
        o.close();
    }

}

