package ru.atm;

import java.util.HashMap;

public class AccountStorage {

    HashMap<String, Account> accounts;
    public void addAccount (Account account) {
        accounts.put (account.getAccountnumber(), account);
            }

    public Account getAccount (String accountnumber) {
        return accounts.get (accountnumber);
    }

    public AccountStorage() {
        this.accounts = new HashMap<String, Account>();
    }


}
