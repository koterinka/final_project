package ru.atm;

import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CardInfo {
    private String CardNumber;
    private Date ExpirationDate;

    public CardInfo(String cardNumber, Date expirationDate) {
        this.CardNumber = cardNumber;
        this.ExpirationDate = expirationDate;

    }
}
