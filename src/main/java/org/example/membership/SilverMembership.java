package org.example.membership;

public class SilverMembership  extends MembershipType {
    private static int maximumTrades = 10;
    public int getMaximumTrades() {
        return maximumTrades;
    }

    public boolean canTrade(int dailyTradeNumber, double dailyTradeValue, double maximumTradeValue) {

        return dailyTradeNumber < getMaximumTrades() && dailyTradeValue < maximumTradeValue;
    }
}
