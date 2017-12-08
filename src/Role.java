public enum Role { ADM("Administrator"), EMP("Employee"), CUS("Customer");

    private String role;

    Role(String role){
        this.role = role;
    }

    public String roleString(){
        return this.role;
    }
}
