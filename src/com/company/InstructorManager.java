package com.company;

public class InstructorManager extends UserManager{
    public String findId(Instructor instructor) {
return instructor.getInstructorName().substring(0,1)+instructor.getInstructorLastName().substring(0,1)+instructor.getInstructorId();
    }


}
