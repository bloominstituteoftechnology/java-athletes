package com.lambdaschool.initial;

public class Main
{

    public static void main(String[] args)
    {
        AthleteCreationInjector injector;
        Processor app;

        // Create a Track Athlete
        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        app.create("TRACK",  "USAIN BOLT");

        // Create a Hockey Athlete
        injector = new HockeyAthleteCreationInjector();
        app = injector.getProcess();
        app.create("HOCKEY", "PATRICK KANE");

        // Create a Rugby Athlete
        injector = new RugbyAthleteCreationInjector();
        app = injector.getProcess();
        app.create("RUGBY", "BRIAN O'DISCOLL");

        // Create a Baseball Athlete
        injector = new BaseballAthleteCreationInjector();
        app = injector.getProcess();
        app.create("BASEBALL", "MIKE TROUT");
    }
}
