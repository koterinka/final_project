package ru.atm;

import ru.atm.ATM;
import ru.atm.CardInfo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Human {
    private CardInfo card;
    private String cardPin;

    public Human(CardInfo card, String cardPin) {
        this.card = card;
        this.cardPin = cardPin;
    }
    public Money getCardBalance(Application app) throws Exception {
        return app.getCardBalance(this.card, cardPin);
    }
}
