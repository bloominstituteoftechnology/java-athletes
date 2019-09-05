package com.lambdaschool.initial;

import com.lambdaschool.solution.AthleteService;
import com.lambdaschool.solution.TrackAthleteImpl;

public class MyApplication implements Processor
{
    private Athlete athlete;

    public MyApplication(AthleteService athlete)
    {
        this.athlete = athlete;
    }

    @Override
    public void create(String sport)
    {
        System.out.println("************");
        athlete.display(sport);
        System.out.println("************");
    }
}
