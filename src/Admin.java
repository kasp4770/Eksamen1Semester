public class Admin extends User {

    public Admin(String id) {
        setId(id);
        setRole(Role.ADM);
        Bank.users.add(this);
        Bank.noOfUsers ++;
    }

    public void displayUsers() {
        for (int i = 0; i < Bank.users.size(); i++) {
            System.out.println(
                    Bank.users.get(i).getId() + " " +
                    Bank.users.get(i).getRole());
        }
    }
}
