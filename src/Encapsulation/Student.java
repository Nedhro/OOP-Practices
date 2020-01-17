package Encapsulation;

public class Student {
    private int rollNo;
    private String name;
    private int classNo;
    private String gender;

    public Student(int rollNo, String name, int classNo, String gender) {
        this.rollNo = rollNo;
        this.name = name;
        this.classNo = classNo;
        this.gender = gender;
    }

    public Student() {
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
