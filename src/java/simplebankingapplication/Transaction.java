package simplebankingapplication;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaction {
    private int id;
    private int accountId;
    private String type;
    private double amount;
    private LocalDateTime date;
    private String details;

    public Transaction(int id, int accountId, String type, double amount, LocalDateTime date, String details) {
        this.id = id;
        this.accountId = accountId;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.details = details;
    }

    public static void main(String[] args) {
        Transaction transaction1 = new Transaction(12,12,"sdfsdf", 12000,LocalDateTime.now(), "ssfsdf" );
        System.out.println(transaction1.date);
    }
}
