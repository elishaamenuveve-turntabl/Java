package org.example.membership;

import java.time.LocalTime;

public class BronzeMembership extends MembershipType {
    private static int maximumTrades = 5;


    public int getMaximumTrades() {
        return maximumTrades;
    }

    public boolean canTrade(int dailyTradeNumber, double dailyTradeValue, double maximumTradeValue) {
        if(LocalTime.now().compareTo(LocalTime.of(8,0)) < 0) {
            return false;
        }
        if (dailyTradeNumber < this.getMaximumTrades()) {
            return true;
        } else {
            return false;
        }
    }
}

