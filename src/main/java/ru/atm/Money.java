package ru.atm;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Money {
    private BigDecimal amount;
    private Currency currency;

    public Money(String amount, Currency currency) {
        this.amount = new BigDecimal(amount);
        this.currency = currency;
    }

    public String toString() {
        return String.format("%s %s", this.amount, this.currency);
    }
}

