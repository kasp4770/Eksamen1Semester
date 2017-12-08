public class Account {

    private String cusId;
    private int accountNumber;
    private double balance;
    private Account[] accounts;
    private int noOfAccounts;

    public Account(String cusId, int accountNumber, double balance){
        Account a = new Account(cusId, accountNumber, balance);
        accounts[noOfAccounts] = a;
        noOfAccounts++;
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

    public Account[] getAccounts() {
        return accounts;
    }

    public int getNoOfAccounts() {
        return noOfAccounts;
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

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public void setNoOfAccounts(int noOfAccounts) {
        this.noOfAccounts = noOfAccounts;
    }
}
