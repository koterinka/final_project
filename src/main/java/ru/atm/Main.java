package ru.atm;

import ru.atm.ATM;
import ru.atm.CardInfo;
import ru.atm.Human;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Date;

public class Main {
    public static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        Date ExpirationDate = new Date();
        CardInfo cardInfo= new CardInfo("12345678",ExpirationDate);
        Human human = new Human(cardInfo, "4321");
        ATM atm= new ATM();
           logger.info("My balance is {}", human.getCardBalance(atm));
    }


}
