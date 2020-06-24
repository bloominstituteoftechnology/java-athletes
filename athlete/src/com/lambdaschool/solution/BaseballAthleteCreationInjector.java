package com.lambdaschool.solution;

public class BaseballAthleteCreationInjector implements AthleteCreationInjector
{
	@Override
	public Processor getProcess()
	{
		return new MyAthlete(new BaseballAthleteImpl());
	}
}
