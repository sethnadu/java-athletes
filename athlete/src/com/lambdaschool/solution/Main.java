package com.lambdaschool.solution;

public class Main
{
    public static void main(String[] args)
    {
        AthleteCreationInjector injector;
        Processor app;

        // Create a Track Athlete
        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete("Track Runner");


        // Create a Hockey Athlete
        injector = new HockeyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete("Hockey Goalie");


        // Create a Rugby Athlete
        injector = new RugbyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete("Rugby Athlete");


        // Create a Baseball Athlete
        injector = new BaseballAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete("Baseball Athlete");

    }
}
