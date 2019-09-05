package com.lambdaschool.solution;

import com.lambdaschool.initial.MyApplication;

public class BaseballAthleteCreationInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess() {
        return (Processor) new MyApplication(new BaseballAthleteImpl());
    }
}
