package ru.atm;

import ru.atm.ATM;
import ru.atm.CardInfo;
import ru.atm.Human;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
    Date ExpirationDate = new Date();
    CardInfo cardInfo= new CardInfo("12345678",ExpirationDate);
    Human human = new Human(cardInfo, 4321);
    ATM atm= new ATM();

    human.InquireAboutBalance(atm);
    }


}
