package com.lambdaschool.initial;

public class RugbyAthleteCreationInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new RugbyPlayerImplimentation());
    }
}
