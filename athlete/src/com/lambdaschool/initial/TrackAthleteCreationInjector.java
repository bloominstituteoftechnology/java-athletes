package com.lambdaschool.initial;

public class TrackAthleteCreationInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new TrackRunnerImplimentation());
    }
}
