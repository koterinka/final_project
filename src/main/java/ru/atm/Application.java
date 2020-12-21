package ru.atm;

public interface Application {
    Money getCardBalance(CardInfo card, String cardPin) throws Exception;
}
