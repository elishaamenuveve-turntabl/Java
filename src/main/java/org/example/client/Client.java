package org.example.client;

import org.example.membership.MembershipType;
import org.example.trade.Trade;

import java.time.LocalDate;

public class Client {
    private String firstName;
    private String lastName;
    private MembershipType membership;
    private int tradePoints = 0;
    private LocalDate dateOfLastTrade;
    private int dailyTradeNumber;
    private double dailyTradeValue;
    private double maximumDailyTradeValue = 10_000_000;


    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addTrade(Trade trade) {
        if (this.canTrade()) {
            this.dailyTradeNumber += 1;
            this.dailyTradeValue += trade.getTradeValue();
        } else {
            System.out.println("Error");
        }
    }

    public double getMaximumDailyTradeValue() {
        return maximumDailyTradeValue;
    }

    public void setMaximumDailyTradeValue(double maximumDailyTradeValue) {
        this.maximumDailyTradeValue = maximumDailyTradeValue;
    }

    private void resetDailyTradeInformation () {
        this.dailyTradeValue = 0;
        this.dailyTradeNumber = 0;
        this.dateOfLastTrade = LocalDate.now();
    }

    private void addPoints() {
        this.tradePoints += 1;
        this.membership = MembershipType.assignMembership(this.tradePoints);
    }

    public boolean canTrade() {
        if (!LocalDate.now().equals(dateOfLastTrade)) {
            this.resetDailyTradeInformation();
        }
        if (membership != null) {
            return membership.canTrade(dailyTradeNumber, dailyTradeValue, maximumDailyTradeValue);
        } else {
            return true;
        }
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\ntradePoints: " + tradePoints +
                "\ndailyTradeValue: " + dailyTradeValue +
                "\ndailyTradeNumber: " + dailyTradeNumber +
                "\ndateOfLastTrade: " + dateOfLastTrade +
                "\nmaximumDailyTradeValue: " + maximumDailyTradeValue;
    }


}