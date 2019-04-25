package com.lambdaschool.initial;

public class HockeyAthleteCreationInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new HokeyPlayerImplimentation());
    }
}
