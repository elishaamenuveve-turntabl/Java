package org.example.membership;

import java.time.LocalTime;

public enum NewMembershipType {
    BRONZE(5) {
        public boolean canTrade(int numberOfTradesMadeToday, double dailyTradeValue, double maximumTradeValue) {

            if(LocalTime.now().isAfter(LocalTime.of(10, 0))) {
                    return numberOfTradesMadeToday < BRONZE.maximumTrades;
            }
            return false;
        }
    }, SILVER(10) {

        public boolean canTrade(int numberOfTradesMadeToday, double dailyTradeValue, double maximumTradeValue) {
            return numberOfTradesMadeToday < SILVER.maximumTrades && dailyTradeValue < maximumTradeValue;
        }

    }, GOLD(20) {
        public boolean canTrade(int numberOfTradesMadeToday, double dailyTradeValue, double maximumTradeValue) {
            return numberOfTradesMadeToday < GOLD.maximumTrades;
        }
    };

    private final int maximumTrades;


    NewMembershipType(int maximumTrades) {
        this.maximumTrades = maximumTrades;
    }


    public static NewMembershipType assignMembership(int points) {

         if (points > 0 && points <= 20) {
            return NewMembershipType.SILVER;
        } else {
            return NewMembershipType.GOLD;
        }
    }

    public abstract boolean canTrade(int dailyTradeNumber, double dailyTradeValue, double maximumDailyTradeValue);
}
