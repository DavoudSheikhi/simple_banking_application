package simplebankingapplication;

public class Account {
    private int id;
    private int costumerId;
    private int accountNumber;
    private double balance;

    public Account(int id, int costumerId, int accountNumber, double balance) {
        this.id = id;
        this.costumerId = costumerId;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCostumerId(int costumerId) {
        this.costumerId = costumerId;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public int getCostumerId() {
        return costumerId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
