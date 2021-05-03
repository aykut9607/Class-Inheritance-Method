package com.company;

import java.util.Random;

public class StudentManager extends UserManager {

    public String findId(Student student) {

     return student.getStudentName().substring(0,1)+student.getStudentLastName().substring(0,1)+student.getStudentId();

    }
}
