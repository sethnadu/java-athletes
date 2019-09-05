package com.lambdaschool.solution;

public class MyApplication implements Processor
{
    private AthleteCreation sport;

    public MyApplication(AthleteCreation sport)
    {
        this.sport = sport;
    }

    @Override
    public void displayAthlete(String sportname)
    {
        sportname = "\n*************\n" + sportname + "\n*************";
        sport.displayAthlete(sportname);

    }

}
