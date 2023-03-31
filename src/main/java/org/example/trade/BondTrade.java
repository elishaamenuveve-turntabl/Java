package org.example.trade;

public class BondTrade extends Trade {


    public BondTrade(String id, String symbol, int quantity, double price, double dividend) {
        super(id, symbol, quantity, price);
        super.setDividend(dividend);
    }

    public double calcDividend() {
        return super.getDividend();
    }

    public String toString() {
        return super.toString() + ", Dividend: " + calcDividend();
    }

}