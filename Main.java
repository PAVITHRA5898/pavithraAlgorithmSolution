package pavithra.Stockers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("enter the no of companies");
        Scanner sc = new Scanner(System.in);
        int compCount = sc.nextInt();
        int rise=0,decline=0 ;
        double temp=0.0;
        double[] stockPrice = new double[20];
        boolean[] value = new boolean[20];
        int choice;
            for(int i = 1;i<= compCount;i++){
                System.out.println("Enter current stock price of the company "+i); 
                stockPrice[i] = sc.nextDouble();
                System.out.println("Whether company's stock price rose today compare to yesterday?"); 
                value[i] = sc.nextBoolean(); 
            }
             while(compCount != 0){
                System.out.println("-----------------------------------------------");
                System.out.println("Enter the operation that you want to perform"); 
                System.out.println("1. Display the companies stock prices in ascending order");
                System.out.println("2. Display the companies stock prices in descending order");
                System.out.println("3. Display the total no of companies for which stock prices rose today");
                System.out.println("4. Display the total no of companies for which stock prices declined today");
                System.out.println("5. Search a specific stock price");
                System.out.println("6. press 0 to exit ");
                System.out.println("-----------------------------------------------");
                choice= sc.nextInt();
                if(choice == 0){
                    System.out.println("Exited successfully");
                    break;
                }
                switch(choice){
                    case 1 : Ascending ascending = new Ascending();
                             ascending.ascendingArrange(compCount, temp, stockPrice);
                             break;
                    case 2: Descending descending = new Descending();
                            descending.descendingArrange(compCount, temp, stockPrice);
                            break;
                    case 3: Rise riseStock = new Rise();
                            int val = riseStock.risingStocks(compCount,value,rise);
                            System.out.println(val);
                            break;
                    case 4: Decline declineStock = new Decline();
                            int val1 = declineStock.declineStocks(compCount,value,decline);
                            System.out.println(val1);
                            break;
                    case 5: SearchStock searchStock = new SearchStock();
                            searchStock.searchStock(compCount,stockPrice); 
                            break;
                    default : System.out.println("Exited successfully");            
                }  
            }
        sc.close();
    }
}   