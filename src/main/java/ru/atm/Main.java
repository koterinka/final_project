package ru.atm;

import ru.atm.ATM;
import ru.atm.CardInfo;
import ru.atm.Human;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        SimpleDateFormat sdf= new SimpleDateFormat ("yyyy-MM-dd");
        Date ExpirationDate;
        try {
            ExpirationDate = sdf.parse("2021-12-23");
        }
        catch (Exception e){
            ExpirationDate = new Date()
;        }
        CardInfo cardInfo= new CardInfo("12345678",ExpirationDate);
        Human human = new Human(cardInfo, "4321");
        ATM atm= new ATM();
        atm.getAccountStorage().addAccount(new Account (cardInfo.getCardNumber(),new Money("777",Currency.EUR)));
    try {
            logger.info("My balance is {}", human.getCardBalance(atm));

        Account a = atm.getAccountStorage().getAccountByCondition(acct -> acct.getBalance().getAmount().floatValue() > 100);
        }
        catch (Exception e){
            logger.error("Exception: "+e);
        }
    }


}
