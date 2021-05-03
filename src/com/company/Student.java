package com.company;

import java.util.Random;

public class Student extends User{

    private int StudentId;
    private String StudentName;
    private String StudentLastName;
    private int StudentProgressPercentage;
    public Student(String StudentName,String StudentLastName,int StudentProgressPercentage) {
        this.StudentName = StudentName;
        this.StudentLastName = StudentLastName;
        this.StudentProgressPercentage = StudentProgressPercentage;
    }
    public Student()
    {

    }
    public int getStudentId() {
        Random random=new Random();
        StudentId= random.nextInt(10);
        return StudentId;
    }


    public String getStudentName() {
        return StudentName;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentLastName() {
        return StudentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        StudentLastName = studentLastName;
    }

    public int getStudentProgressPercentage() {
        return StudentProgressPercentage;
    }

    public void setStudentProgressPercentage(int studentProgressPercentage) {
        this.StudentProgressPercentage = studentProgressPercentage;
    }
}
