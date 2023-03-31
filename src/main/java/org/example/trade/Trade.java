package org.example.trade;

import java.time.LocalDateTime;

public abstract class Trade {

    private String id;
    private String symbol;
    private int quantity;
    private double price;
    private double dividend;
    private LocalDateTime localDateTime;

    public Trade(String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        setPrice(price);
        this.localDateTime = LocalDateTime.now();
    }

    public Trade(String id, String symbol, int quantity) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.localDateTime = LocalDateTime.now();
    }

    public void buy() {
        //
    }
    public void sell () {
        //
    }

    public double getDividend() {
        return this.dividend;
    }

    public void setDividend(double dividend) {
        this.dividend = dividend;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public double getTradeValue() {
        return this.quantity * this.price;
    }


    public abstract double calcDividend();

    public String toString() {
        return "ID: " + id + ", Symbol: " + symbol + ", Quantity: " + quantity + ", Price: " + price;
    }

    public static Trade[] randomTradeGenerator(int number) {

        Trade[] trades = new Trade[number];
        for (int i = 0; i < number; i++) {
            int randomNumber = (int) Math.floor(Math.random()*2);
            if (randomNumber == 0) {
                trades[i] = new BondTrade("T"+(i+1), "AAP", (int) Math.floor(Math.random()*100), Math.floor(Math.random()*100), Math.floor(Math.random()*100));
            } else  {
                trades[i] = new FundTrade("T"+(i+1), "AAP", (int) Math.floor(Math.random()*100), Math.floor(Math.random()*100), Math.random()*100);
            }
        }
        return trades;
    }
}