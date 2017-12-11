public class Customer extends User {

    Customer(String id){
        setId(id);
        setRole(Role.CUS);
        Bank.users.add(this);
        Bank.noOfUsers ++;
    }
}
