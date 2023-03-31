package org.example.membership;

public class SilverMembership  extends MembershipType {
    private static int maximumTrades = 10;
    public int getMaximumTrades() {
        return maximumTrades;
    }


    public boolean canTrade(int dailyTradeNumber, double dailyTradeValue, double maximumTradeValue) {
        System.out.println(getMaximumTrades());
        System.out.println("Daily Trade Number: " + dailyTradeNumber);
        System.out.println("Daily Trade Value: " + dailyTradeValue);
        System.out.println("Max Trade Value: " + maximumTradeValue);
        if (dailyTradeNumber < getMaximumTrades() && dailyTradeValue < maximumTradeValue) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }
}
