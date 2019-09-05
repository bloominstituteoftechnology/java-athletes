package com.lambdaschool.solution;

public class MyApplication implements Processor
{
    private AthleteService athleteService;

    public MyApplication(AthleteService athleteService)
    {
        this.athleteService = athleteService;
    }

    @Override
    public void displayAthlete(String athlete)
    {
        athlete = athlete;
        athleteService.displayAthlete(athlete);
    }
}
