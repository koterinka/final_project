package ru.atm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Predicate;

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

    public Account getAccountByCondition (Predicate<Account> predicate) {
        Iterator it = this.accounts.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry) it.next();
            if (predicate.test((Account)pair.getValue()))
                return (Account)pair.getValue();
        }
        return null;
    }
}
