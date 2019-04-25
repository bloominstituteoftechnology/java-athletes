package com.lambdaschool.solution;

public class TrackAthleteCreationInjector implements AthleteCreationInjector
{
	@Override
	public Processor getProcess()
	{
		return new MyAthlete(new TrackAthleteImpl());
	}
}
