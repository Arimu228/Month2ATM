package com.example.month2atm;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(15000);
        while (true) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println("У вас не достаточно средств на карте " + bankAccount.getAmount());
                try {
                    bankAccount.withDraw((int) bankAccount.getAmount());
                } catch (Exception ex) {
                    System.out.println("у вас снялось " +  ex.getMessage());;
                }
            }

            System.out.println("Current amount: " + bankAccount.getAmount());
        }
    }
}
