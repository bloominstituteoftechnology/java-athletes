package com.lambdaschool.initial;

public class TrackRunnerImplimentation implements AthleteService
{

    @Override
    public void display(String sport, String athleteName)
    {
        System.out.println(sport + " Athlete - " + athleteName);
    }
}
