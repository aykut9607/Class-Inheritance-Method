package com.company;

import java.util.Random;

public class UserManager {
    public int findId(User user)
    {
        Random random=new Random();
        user.id= random.nextInt(10);
        return user.id;
    }



}
