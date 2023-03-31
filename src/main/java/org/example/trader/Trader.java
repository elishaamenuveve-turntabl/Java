package org.example.trader;

import org.example.account.Account;
import org.example.trade.Trade;

public class Trader {
    private String name = null;
    private Account account = null;

    public Trader(String name) {
        this.name = name;
        this.account = new Account();
    }

    public void addTrade(Trade trade) {
        double newTradeTotal = this.account.getTotalTradeValue() + (trade.getQuantity() * trade.getPrice());
        account.setTotalTradeValue(newTradeTotal);
        this.account.addTrade(trade);
    }

    public double getTotalTradeValue() {
        return this.account.getTotalTradeValue();
    }

    public void printTrades(int max) {
        account.printTrades(max);
    }

    public String toString() {
        return "Trader: " + name + ", " + account.toString();
    }
}