// Stock port polio list
package com.bridgelabz.oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockPortfolio
{
    List<Stock> stockList=new ArrayList<>();
    private int portfolioSize;
    private int totalValueOfStocks;
    static Scanner input=new Scanner(System.in);
    public void stocksPortfolio(){
        System.out.print("Enter the number of stocks add into portfolio : ");
        portfolioSize=input.nextInt();
        for(int i=0;i<portfolioSize;i++){
            Stock stocks=new Stock();
            System.out.print("Share Name : ");
            stocks.setShareName(input.next());
            System.out.print("Enter number of shares : ");
            stocks.setNumberOfShare(input.nextInt());
            System.out.print("Enter share price : ");
            stocks.setSharePrice(input.nextInt());
            stocks.setValueOfStock(stocks.getNumberOfShare()*stocks.getSharePrice());
            stockList.add(stocks);
            System.out.println("'"+stocks.getShareName()+"' Stock added to portfolio");
            totalValueOfStocks+=stocks.getValueOfStock();
        }
        System.out.println("Total value of the stocks is => "+totalValueOfStocks);
    }
}