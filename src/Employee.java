public class Employee extends User {

    private Bank bank;


    public Employee(String id){
        setId(id);
        setRole(Role.EMP);
    }

    public void createAccount(String cusId, int accountNumber, double balance){
        Account a = new Account(cusId, accountNumber, balance);

    }
}
