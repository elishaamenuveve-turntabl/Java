package org.example.membership;

import java.time.LocalTime;

public enum NewMembershipType {
    BRONZE(5) {
        public boolean canTrade(int dailyTradeNumber, double dailyTradeValue, double maximumTradeValue) {

            if(LocalTime.now().isBefore(LocalTime.of(10, 0))) {
                return false;
            }
            if (dailyTradeNumber < this.maximumTrades) {
                return true;
            } else {
                return false;
            }
        }
    }, SILVER(10) {

        public boolean canTrade(int dailyTradeNumber, double dailyTradeValue, double maximumTradeValue) {
            if (dailyTradeNumber < this.maximumTrades && dailyTradeValue < maximumTradeValue) {
                return true;
            } else {
                return false;
            }
        }

    }, GOLD(20) {
        public boolean canTrade(int dailyTradeNumber, double dailyTradeValue, double maximumTradeValue) {
            if (dailyTradeNumber < this.maximumTrades) {
                return true;
            } else {
                return false;
            }
        }

    };

     int maximumTrades;
    NewMembershipType(int maximumTrades) {
        this.maximumTrades = maximumTrades;
    }


    public static NewMembershipType assignMembership(int points) {
        if (points > 0 && points <= 10) {
            return NewMembershipType.BRONZE;
        } else if (points > 10 && points <= 20) {
            return NewMembershipType.SILVER;
        } else {
            return NewMembershipType.GOLD;
        }
    }

    public abstract boolean canTrade(int dailyTradeNumber, double dailyTradeValue, double maximumDailyTradeValue);
}
