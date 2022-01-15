package com.model;
import java.util.Scanner;

public class SearchStock {
    Scanner sc = new Scanner(System.in);
    int flag = 0;
    public void searchStock(int compCount,double[] stockPrice){
        System.out.println("enter the key value");
        double find = sc.nextDouble();
        for(int i=1;i<=compCount;i++){
            if(stockPrice[i] == find){
                System.out.println("Stock of value "+find+" is present");
                flag =1;
                break;
            }
        }
        if(flag ==0){
            System.out.println("key not found");
        }
    }
}
