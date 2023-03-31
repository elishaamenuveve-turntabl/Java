package org.example.trade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TradeTest {

    @Test
    public void negativePriceForTradeTest() {

        //arrange
        Trade cut = new BondTrade("T1", "AAP", 100, 12.5, 1.5);
        double tradePriceTestValue = 0;

        // act
        cut.setPrice(tradePriceTestValue);

        //assert
        assertEquals(12.5, cut.getPrice());
    }

    @Test
    public void bondTestDividendCalculationTest() {
        Trade cut = new BondTrade("T1", "AAP", 100, 12.5, 1.5);


        cut.setPrice(100);

        assertEquals(1.5, cut.getDividend());

    }

    @Test
    public void fundTestDividendCalculationTest() {

        Trade cut = new FundTrade("T1", "AAP", 100, 15, 0.15);

        cut.setPrice(100);

        assertEquals(15, cut.getDividend());

    }
}
