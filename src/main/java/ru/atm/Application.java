package ru.atm;

import java.math.BigDecimal;

public interface Application {
    BigDecimal GetCardBalance(CardInfo Card, String CardPin);
}
