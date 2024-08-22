package Model;

import db.BankDB;

public class Account extends BankDB {
    private String AccountNumber;
    private String Customer;
    private AccountTypes AccountTypes;

    public Account() {
    }

    public Account(String accountNumber, String customer, Model.AccountTypes accountTypes) {
        AccountNumber = accountNumber;
        Customer = customer;
        AccountTypes = accountTypes;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccountNumber=" + AccountNumber +
                ", Customer='" + Customer + '\'' +
                ", AccountTypes=" + AccountTypes +
                '}';
    }


}