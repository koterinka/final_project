package ru.atm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CardInfo {
    public String CardNumber;
    public Date ExpirationDate;
    public CardInfo(String Cardnumber, Date ExpirationDate) {
        this.CardNumber = Cardnumber;
        this.ExpirationDate = ExpirationDate;

    }
}
