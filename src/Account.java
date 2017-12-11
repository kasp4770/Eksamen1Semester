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
        Bank.noOfAccounts++;
        /*if (!Bank.users.equals(cusId)) { //Virker ikke efter hensigten
                Customer c = new Customer(cusId);
                Bank.noOfUsers++;
        }
        else {
                System.out.println("Eksisterende bruger har fået oprettet en konto");
        }*/


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
