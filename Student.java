//672115039 Metavee Aeinjang
// this code is for tutorial3 assignment in ADT and problem solving only
package tutorial3;

public class Student {
    private String name;
    private String GPA;
    private String ID;

    public Student(String name, String GPA, String ID){
        this.name = name;
        this.GPA = GPA;
        this.ID = ID;
    }
    public String toString() {
        return "Student{name = '" + name + "', GPA = '" + GPA + "', studentID = '" + ID + "'}";
    }

}
