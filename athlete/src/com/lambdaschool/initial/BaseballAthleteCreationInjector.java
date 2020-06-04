package com.lambdaschool.initial;

public class BaseballAthleteCreationInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new BaseballAthleteImplimentation());
    }
}
