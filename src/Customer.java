public class Customer extends User {

    Customer(String id){
        setId(id);
        setRole(Role.CUS);

    }
    public String getRoleString(){
        return Role.CUS.roleString();
    }

}
