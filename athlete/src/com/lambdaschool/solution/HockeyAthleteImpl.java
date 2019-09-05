package com.lambdaschool.solution;

public class HockeyAthleteImpl implements AthleteService
{
    @Override
    public void displayAthlete(String athlete)
    {
        System.out.println("************");
        System.out.println(athlete + " Athlete");
        System.out.println("************");
    }
}

