package com.lambdaschool.solution;

public class MyApplication implements Processor
{
    private AthleteCreation sport;
    private CourtCreation court;

    public MyApplication(AthleteCreation sport)
    {
        this.sport = sport;
    }

    public MyApplication(CourtCreation court)
    {
        this.court = court;
    }

    @Override
    public void displayAthlete(String sportname)
    {
        sportname = "\n*************\n" + sportname + "\n*************";
        sport.displayAthlete(sportname);

    }

    @Override
    public void displayCourt(String courtname)
    {
        courtname = "\n*************\n" + courtname + "\n*************";
        court.displayCourt(courtname);
    }
}
