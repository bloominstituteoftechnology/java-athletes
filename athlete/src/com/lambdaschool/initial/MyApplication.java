package com.lambdaschool.initial;

public class MyApplication
{
    private Athlete athlete = new Athlete();

    public void create(String sport)
    {
        System.out.println("************");
        athlete.display(sport);
        System.out.println("************\n");
    }
}
