package ru.atm;

import java.math.BigDecimal;

public class Money {
    BigDecimal amount;
    Currency currency;

    public Money(String amount, Currency currency) {
        this.amount = new BigDecimal(amount);
        this.currency = currency;
    }

    public String toString() {
        return String.format("%s %s", this.amount, this.currency);
    }
}

