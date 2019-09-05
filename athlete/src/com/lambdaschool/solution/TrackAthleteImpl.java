package com.lambdaschool.solution;

public class TrackAthleteImpl implements AthleteService
{
    @Override
    public void displayAthlete(String athlete)
    {
        System.out.println("************");
        System.out.println(athlete + " Runner");
        System.out.println("************");
    }
}
