package org.example.membership;

public abstract class MembershipType {


    public abstract int getMaximumTrades();
    //    public abstract void setMaximumTrades(int maximumTrades);
    public abstract boolean canTrade(int dailyTradeNumber, double dailyTradeValue, double maximumTradeValue);

    public static MembershipType assignMembership(int points) {
        if (points > 0 && points < 11) {
            return new BronzeMembership();
        } else if (points > 10 && points < 21) {
            return new SilverMembership();
        } else {
            return new GoldMembership();
        }
    }


}