public class Employee extends User {

    public Employee(String id){
        setId(id);
        setRole(Role.EMP);
        Bank.users.add(this);
        Bank.noOfUsers ++;
    }

    public void createAccount(String cusId, int accountNumber, double balance){
        Account a = new Account(cusId, accountNumber, balance);
    }

    public void displayAccounts(){ //VIRKER IKKE EFTER HENSIGTEN
            for (int i = 0; i < Bank.accounts.size(); i++) {
                if(Bank.users.contains(Role.CUS)) {
                    System.out.println(
                            Bank.accounts.get(i).getCusId() + " " +
                                    Bank.accounts.get(i).getAccountNumber() + " " +
                                    Bank.accounts.get(i).getBalance() + " " +
                                    Bank.users.get(i).getRole());
                }
            }

    }
}
