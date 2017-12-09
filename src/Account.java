import java.util.ArrayList;

public class Account {

    private String cusId;
    private int accountNumber;
    private double balance;
    //private ArrayList<Account> accounts;

    public Account(String cusId, int accountNumber, double balance){
        this.cusId = cusId;
        this.accountNumber = accountNumber;
        this.balance = balance;
        Bank.accounts.add(this);
    }

    //Getters
    public String getCusId() {
        return cusId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    //Setters
    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
