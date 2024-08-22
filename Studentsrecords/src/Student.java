import java.util.ArrayList;

public class Student {
    private String name;
    private int rollNumber;
    private String ArrayList<Marks> Marks;


    public Student(String name, int rollNumber, ArrayList<Marks> marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        Marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getMarks() {
        return Marks;
    }

    public void setMarks(String Marks) {
        this.Marks = Marks;
    }

}
