package db;

import Model.Account;

public class BankDB {
    private Account[] accounts;
    private int nextIndex;

    public BankDB(){
    }

    public BankDB(int size){
        accounts : accounts = new Account[size] ;
    }

    public void add(Account account){
        if(nextIndex==0) {
            accounts[nextIndex] = account;
            nextIndex++;
        }else{
            accounts[nextIndex]= account;
            nextIndex++;
        }
    }
    public void print(String accNumber){
        for (int i = 0; i<accounts.length; i++){
            if (accounts[i].getAccountNumber().equals(accNumber)){
                System.out.println(accounts[i]);
            }else {
                System.out.println("Not Found");
            }

        }
    }

}