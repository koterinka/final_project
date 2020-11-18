package ru.atm;

import ru.atm.ATM;
import ru.atm.CardInfo;

public class Human {

    public void InquireAboutBalance(ATM atm)
    {
        System.out.println("My balance is: " + atm.GetCardBalance(this.card, cardPin));
    }

    private CardInfo card;
    private int cardPin;

    public Human(CardInfo card, int cardPin) {
        this.card = card;
        this.cardPin = cardPin;
    }
}
