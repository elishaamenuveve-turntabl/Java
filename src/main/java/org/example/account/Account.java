package org.example.account;

import org.example.trade.Trade;

public class Account {
    private double totalTradeValue = 0;
    private Trade[] trades = new Trade[100];
    private int numberOfTrades = 0;


    public double getTotalTradeValue() {
        return this.totalTradeValue;
    }

    public void setTotalTradeValue(double totalTradeValue) {
        this.totalTradeValue = totalTradeValue;
    }

    public String toString() {
        return "Total Trade Value: " + totalTradeValue;
    }

    public void printTrades (int max) {
        for (int i = 0; i < numberOfTrades; i++) {
            if (trades[i].getPrice() < max){
                System.out.println(trades[i]);
            }

        }
    }

    public void addTrade(Trade trade) {
        // when trades exceed trades length we will get an exception
        trades[numberOfTrades] = trade;
        numberOfTrades++;
    }

}