package com.lambdaschool.solution;

public class RugbyAthleteCreationInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess() {
        return (Processor) new MyApplication(new RugbyAthleteImpl());
    }
}
