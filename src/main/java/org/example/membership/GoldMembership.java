package org.example.membership;

public class GoldMembership extends MembershipType {
    private static int maximumTrades = 20;


    public int getMaximumTrades() {
        return maximumTrades;
    }

    public boolean canTrade(int dailyTradeNumber, double dailyTradeValue, double maximumTradeValue) {
        if (dailyTradeNumber < this.getMaximumTrades()) {
            return true;
        } else {
            return false;
        }
    }
}
