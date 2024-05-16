package com.example.month2atm;

public class LimitException extends Exception {

    private double remainingAmount;

    public LimitException(String message, Double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

}
