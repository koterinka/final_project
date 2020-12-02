package ru.atm;

import ru.atm.ATM;
import ru.atm.CardInfo;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

public class Human {
    @Getter @Setter private CardInfo card;
    @Getter @Setter private String cardPin;

    public Human(CardInfo card, String cardPin) {
        this.card = card;
        this.cardPin = cardPin;
    }
    public BigDecimal GetCardBalance(Application atm){
      return atm.GetCardBalance(this.card, cardPin);
    }
}
