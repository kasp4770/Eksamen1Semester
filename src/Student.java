public class Student extends Person{

    //Datafield
    private int age = 0; //Deklarerer variabel 'age' med typen 'int' og initialiserer den med værdien '0'
    public int grade;
    public double averageGrade;

    //Constructor
    public Student(String fName, String lName, int age, double averageGrade){
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.averageGrade = averageGrade;

    }
    //Set-metoder
    public void setAverageGrade(double averageGrade){
        this.averageGrade = averageGrade;
    }
    //Get-metoder
    public double getAverageGrade(){
        final double bonus;
        bonus = 1.12;
        averageGrade = bonus*averageGrade;
        return (int)averageGrade;
    }
}
