package ru.atm;

import ru.atm.ATM;
import ru.atm.CardInfo;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
public class Human {
    private CardInfo card;
    private String cardPin;

    public Human(CardInfo card, String cardPin) {
        this.card = card;
        this.cardPin = cardPin;
    }
    public BigDecimal getCardBalance(Application app){
      return app.getCardBalance(this.card, cardPin);
    }
}
