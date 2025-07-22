package simplebankingapplication;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Customer customer1 = new Customer( "john", "doe@gmail.com", "099900000");

        BankingApp bankingApp1 = new BankingApp();
        bankingApp1.createBankAccount(customer1);
//        bankingApp1.addCustomer(customer1.getName(), customer1.getEmail(), customer1.getPhone());
        bankingApp1.depositMoney(customer1, 20500);
    }
}
