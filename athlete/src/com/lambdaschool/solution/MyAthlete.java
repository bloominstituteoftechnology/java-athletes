package com.lambdaschool.solution;

public class MyAthlete implements Processor
{
	private AthleteService athleteSrv;

	public MyAthlete(AthleteService athleteSrv)
	{
		this.athleteSrv = athleteSrv;
	}

	@Override
	public void displayAthlete(String athlete)
	{
		athlete = "*********\n" + athlete + " Athlete\n**********\n";
		athleteSrv.displayAthlete(athlete);
	}
}
