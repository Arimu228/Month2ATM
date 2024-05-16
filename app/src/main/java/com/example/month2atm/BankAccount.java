package com.example.month2atm;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public BankAccount() {
        this.amount = 0;
    }

    public void withDraw(int sum) throws LimitException {
        if (amount <= sum) {
            throw new LimitException("У вас на счету осталось", amount);
        }
        amount -= sum;
    }
}
