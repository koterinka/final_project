package ru.atm;

import java.util.Date;

public class ATM implements Application {
    @Override
    public Money getCardBalance(CardInfo card, String pinCode) throws Exception {
        if(card.getExpirationDate().before(new Date()))
            throw new Exception("card expired");
        return new Money("777", Currency.EUR);
    }
}
