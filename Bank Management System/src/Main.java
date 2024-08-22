import db.BankDB;
import Model.Account;
import Model.AccountTypes;
import Model.Customer;

public class Main {
    public static void main(String[] args) {
        BankDB bankDB = new BankDB(100);

        Customer customer1 = new Customer(001,"kamal","panadura");

        System.out.println(customer1);

        Account accounts = new Account("001", "customer1", AccountTypes.SAVINGS);
        System.out.println(accounts);

        bankDB.add(accounts);

    }
}