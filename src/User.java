public class User {

    private String id;
    private Role role;
    private int[] users;
    private int noOfUsers = 0;

    //No-arg constructor
    public User(){}

    //Constructor
    public User(String id, Role role){
        this.id = id;
        this.role = role;

    }
    //Getters
    public String getId() {
        return id;
    }

    public String getRole() {
        return role.roleString();
    }

    //Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setRole(Role role){
        this.role = role;
    }
}
