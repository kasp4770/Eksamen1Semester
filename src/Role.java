public enum Role { ADM("Administrator"), EMP("Medarbejder"), CUS("Kunde");

    private String role;

    Role(String role){
        this.role = role;
    }

    public String roleString(){
        return this.role;
    }
}
