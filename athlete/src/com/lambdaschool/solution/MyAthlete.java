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
		//rules of every athlete
		athlete = "*********\n" + athlete + " \n**********\n";
		athleteSrv.displayAthlete(athlete);
	}
}
