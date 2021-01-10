package ru.atm;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
    private String accountnumber;
    private Money balance;

    public Account(String acountnumber, Money balance) {
        this.accountnumber = acountnumber;
        this.balance = balance;
    }
}

