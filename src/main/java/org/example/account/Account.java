package org.example.account;

import org.example.trade.Trade;

import java.util.List;

public class Account {
    private double totalTradeValue = 0;

    private List<Trade> trades;


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
        for (int i = 0; i < trades.size(); i++) {
            if (trades.get(i).getPrice() < max){
                System.out.println(trades.get(i));
            }

        }
    }

    public void addTrade(Trade trade) {
        // when trades exceed trades length we will get an exception
        trades.add(trade);

    }

}