package org.example.membership;

public class PlatinumMembership extends MembershipType{

    public int getMaximumTrades() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean canTrade(int dailyTradeNumber, double dailyTradeValue, double maximumTradeValue) {
        return false;
    }
}
