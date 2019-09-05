package com.lambdaschool.solution;


public class HockeyAthleteCreationInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess() {
        return (Processor) new MyApplication(new HockeyAthleteImpl());
    }
}
