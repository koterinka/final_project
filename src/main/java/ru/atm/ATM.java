package ru.atm;

import java.util.Date;
import lombok.Getter;

@Getter

public class ATM implements Application {
    private AccountStorage accountStorage;

    public ATM() {
        this.accountStorage = new AccountStorage ();
    }

    @Override
    public Money getCardBalance(CardInfo card, String pinCode) throws Exception {
        if(card.getExpirationDate().before(new Date()))
            throw new Exception("card expired");
        return this.accountStorage.getAccount(card.getCardNumber()).getBalance();
    }

}
