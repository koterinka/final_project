package ru.atm;

import java.math.BigDecimal;

public interface Application {
    BigDecimal getCardBalance(CardInfo card, String cardPin);
}
