public class Admin extends User {

    public Admin(String id){
        setId(id);
        setRole(Role.ADM);
    }
}
