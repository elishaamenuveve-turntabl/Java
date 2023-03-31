package org.example.membership;

import java.time.LocalTime;

public enum newMembershipType {
    BRONZE(5) {
        int maximumTrades = 5;
        public boolean canTrade(int dailyTradeNumber, double dailyTradeValue, double maximumTradeValue) {

            if(LocalTime.now().compareTo(LocalTime.of(10,0)) < 0) {
                return false;
            }
            if (dailyTradeNumber < this.maximumTrades) {
                return true;
            } else {
                return false;
            }
        }
    }, SILVER(10) {
        int maximumTrades = 10;

        public boolean canTrade(int dailyTradeNumber, double dailyTradeValue, double maximumTradeValue) {
            if (dailyTradeNumber < this.maximumTrades && dailyTradeValue < maximumTradeValue) {
                return true;
            } else {
                return false;
            }
        }

    }, GOLD(20) {
        int maximumTrades = 20;
        public boolean canTrade(int dailyTradeNumber, double dailyTradeValue, double maximumTradeValue) {
            if (dailyTradeNumber < this.maximumTrades) {
                return true;
            } else {
                return false;
            }
        }

    };

    newMembershipType(int maximumTrades) {
    }
}
