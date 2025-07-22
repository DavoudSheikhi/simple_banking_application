package simplebankingapplication;

import java.sql.*;

public class BankingApp {
    Connection connection;
    Statement statement;
    private String url = "jdbc:postgresql://localhost:5432/bank_information";
    private String username = "postgres";
    private String password = "qweasdzxc";

    public BankingApp() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
    }

    public void createBankAccount(Customer customer) throws SQLException {
        addCustomer(customer.getName(), customer.getEmail(), customer.getPhone());
        String sql = "insert into account(customer_id, balance) values (?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, customer.getId());
        statement.setDouble(2, 0.0d);
        System.out.println(statement);
        statement.executeUpdate();

    }

    public void addCustomer(String name, String email, String phone) throws SQLException {
        String sql = "insert into customer(name,email,phone_number) values (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.setString(2, email);
        statement.setString(3, phone);
        System.out.println(statement);
        statement.executeUpdate();

    }

    public void depositMoney(Account account, double amount) throws SQLException {

        String sql = "insert into account(balance) values (?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setDouble(1, account.getBalance() + amount);
        System.out.println(statement);
        statement.executeUpdate();

    }


}
