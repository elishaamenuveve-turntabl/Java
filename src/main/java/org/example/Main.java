package org.example;

import org.example.client.Client;
import org.example.membership.BronzeMembership;
import org.example.membership.MembershipType;
import org.example.membership.SilverMembership;
import org.example.trade.BondTrade;
import org.example.trade.FundTrade;
import org.example.trade.Trade;
import org.example.trader.Trader;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Trader trader = new Trader("Elvis");
        Trade bondTrade = new BondTrade("T1", "AAPP", 100, 15.25, 120.23);
        bondTrade.getDividend();

//
////        System.out.println(trader);
////        System.out.println(bondTrade);
//        Trade[] trades = Trade.randomTradeGenerator(30);
//        for (int i = 0; i < 30; i++) {
//            trader.addTrade(trades[i]);
//        }
//        trader.addTrade(bondTrade);
////        System.out.println(trader);
//
        Trade fundTrade = new FundTrade("T2", "AAPP", 100, 15.25, 0.12);
        fundTrade.getDividend();
////        System.out.println(fundTrade);
//
//        trader.addTrade(fundTrade);
//        System.out.println(trader);
//        trader.printTrades(10);
//        MembershipType membership = new BronzeMembership();
//        Client client = new Client("John", "Jones", membership);
//        for (int i = 0; i < 20; i++) {
//            client.addTrade(bondTrade);
//            System.out.println(client);
//            System.out.println(client.canTrade());
//        }

//        client.addTrade(fundTrade);
//        System.out.println(client);
//        System.out.println(client.canTrade());


        Client newclient = new Client("John", "Doe");
        System.out.println(newclient);

        Trade [] trades = Trade.randomTradeGenerator(20);
        for (int i = 0; i < 11; i++) {
            newclient.addTrade(trades[i]);
        }
        System.out.println(newclient);

    }


}