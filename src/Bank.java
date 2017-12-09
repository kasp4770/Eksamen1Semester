import java.util.ArrayList;

public class Bank {
    protected static ArrayList<Account> accounts;
    protected static ArrayList<User> users;
    protected static int noOfAccounts;
    protected static int noOfUsers;


    //Constructor
    Bank(){
        accounts = new ArrayList<>();
        noOfAccounts = 0;
        users = new ArrayList<>();
        noOfUsers = 0;
    }

}
