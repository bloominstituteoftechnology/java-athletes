package com.lambdaschool.initial;

public class RugbyPlayerImplimentation implements AthleteService
{
    @Override
    public void display(String sport, String athleteName)
    {
        System.out.println(sport + " Athlete - " + athleteName);
    }
}
