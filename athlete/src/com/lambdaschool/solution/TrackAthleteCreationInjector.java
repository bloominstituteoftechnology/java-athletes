package com.lambdaschool.solution;

import com.lambdaschool.initial.MyApplication;

public class TrackAthleteCreationInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess()
    {
        return (Processor) new MyApplication(new TrackAthleteImpl());
    }
}
