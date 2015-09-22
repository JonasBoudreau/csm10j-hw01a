import java.util.*;
import java.io.*;

/**
 * Jonas Boudreau
 * CSM01J
 * HW 01A
 */
public class Hw01a {
    
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
            throws FileNotFoundException
    {
        //Read from Stocks.txt
        Scanner inFile = new Scanner(new FileReader("stocks.txt"));
        
        //Prompt user
        System.out.println("Enter '1' to get price by stock ticker");
        System.out.println("Enter '2' to get stocks greater than or equal to "
                + "the specified price");
        System.out.println("Enter '3' to quit");
        System.out.print("Your choice: ");
        int menuNum = console.nextInt();
        
        //User choice
        String userStockName, stockName1, stockName2;
        double userStockPrice, stockPrice1, stockPrice2;
        
        switch (menuNum)
        {
            case 1:
                System.out.print("\nEnter a stock ticker: ");
                userStockName = console.next().toUpperCase();
                stockName1 = inFile.next();
                stockPrice1 = inFile.nextDouble();
                stockName2 = inFile.next();
                stockPrice2 = inFile.nextDouble();
                if (userStockName.equals(stockName1))
                    System.out.printf("\n" + userStockName + 
                            " current price %.2f\n", stockPrice1);
                else if (userStockName.equals(stockName2))
                    System.out.printf("\n" + userStockName + 
                            " current price is %.2f\n",stockPrice2);
                else
                    System.out.println("That stock is unrecognized.");
                break;
                
            case 2:
                System.out.print("\nEnter a price: ");
                userStockPrice = console.nextDouble();
                stockName1 = inFile.next();
                stockPrice1 = inFile.nextDouble();
                stockName2 = inFile.next();
                stockPrice2 = inFile.nextDouble();
                if (userStockPrice < stockPrice1)
                    System.out.printf("\n" + stockName1 + " is more than %.2f",
                            userStockPrice);
                if (userStockPrice == stockPrice1)
                    System.out.printf("\n" + stockName1 + " is equal to %.2f",
                            userStockPrice);
                if (userStockPrice < stockPrice2)
                    System.out.printf("\n" + stockName2 + " is more than %.2f\n",
                            userStockPrice);
                if (userStockPrice == stockPrice2)
                    System.out.printf("\n" + stockName2 + " is equal to %.2f\n",
                            userStockPrice);
                break;
            
            case 3:
                System.out.println("\nGoodbye");
                break;
            
            default:
                System.out.println("\nUnrecognized menu option, exiting");
        }
        
    }
    
}
