package com.lambdaschool.initial;


public class MyApplication implements Processor
{
    private AthleteService athlete;

    public MyApplication(AthleteService athlete)
    {
        this.athlete = athlete;
    }

    public void create(String sport, String athleteName)
    {
        System.out.println("************");
        athlete.display(sport, athleteName);
        System.out.println("************\n");
    }
}