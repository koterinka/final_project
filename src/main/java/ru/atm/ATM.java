package ru.atm;

import java.math.BigDecimal;

public class ATM implements Application {
    @Override
    public BigDecimal GetCardBalance(CardInfo card, String pinCode) {
        return new BigDecimal("0");
        //todo money, currency, amount
    }
}
