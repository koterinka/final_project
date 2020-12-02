package ru.atm;

import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

public class CardInfo {
    @Getter @Setter private String CardNumber;
    @Getter @Setter private Date ExpirationDate;

    public CardInfo(String Cardnumber, Date ExpirationDate) {
        this.CardNumber = Cardnumber;
        this.ExpirationDate = ExpirationDate;

    }
}
