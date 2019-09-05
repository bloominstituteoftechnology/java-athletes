package com.lambdaschool.solution;


public class BaseballAthleteCreationInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess() {
        return (Processor) new MyApplication(new BaseballAthleteImpl());
    }
}
