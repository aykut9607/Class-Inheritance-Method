package com.company;

public class Main {

    public static void main(String[] args) {
       Instructor instructor1 =new Instructor("engin","demirog");
       Student student1=new Student("aykut","demir",15);

       InstructorManager instructorManager=new InstructorManager();
       StudentManager studentManager=new StudentManager();

        System.out.println(studentManager.findId(student1));
        System.out.println(instructorManager.findId(instructor1));


    }
}
