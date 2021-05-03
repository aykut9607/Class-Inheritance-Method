package com.company;

import java.util.Random;

public class Instructor extends User{
     private int InstructorId;
     private String InstructorName;
     private String InstructorLastName;
public Instructor()
{

}
     public Instructor(String InstructorName,String InstructorLastname)
     {
          this.InstructorName=InstructorName;
          this.InstructorLastName=InstructorLastname;
     }

     public void setInstructorName(String InstructorName) {
          this.InstructorName = InstructorName;
     }
     public String getInstructorName() {
          return InstructorName;
     }

     public void setInstructorLastName(String InstructorLastName) {
          this.InstructorLastName = InstructorLastName;
     }


     public String getInstructorLastName() {
          return InstructorLastName;
     }

     public int getInstructorId() {
          Random random=new Random();
          InstructorId= random.nextInt(10);
          return InstructorId;
     }
}
