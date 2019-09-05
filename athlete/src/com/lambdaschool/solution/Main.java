package com.lambdaschool.solution;

public class Main
{
    public static void main(String[] args)
    {
        AthleteCreationInjector injector;
        //Stretch Court
        CourtCreationInjector injectorCourt;
        Processor app;

        // Create a Track Athlete
        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete("Track Runner");
        //Stretch Court
        injectorCourt = new TrackCourtCreationInjector();
        app = injectorCourt.getProcess();
        app.displayCourt("Track Field");


        // Create a Hockey Athlete
        injector = new HockeyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete("Hockey Goalie");
        //Stretch Court
        injectorCourt = new HockeyCourtCreationInjector();
        app = injectorCourt.getProcess();
        app.displayCourt("Hockey Rink");



        // Create a Rugby Athlete
        injector = new RugbyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete("Rugby Athlete");
        //Stretch Court
        injectorCourt = new RugbyCourtCreationInjector();
        app = injectorCourt.getProcess();
        app.displayCourt("Rugby Field");


        // Create a Baseball Athlete
        injector = new BaseballAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete("Baseball Athlete");
        //Stretch Court
        injectorCourt = new BaseballCourtCreationInjector();
        app = injectorCourt.getProcess();
        app.displayCourt("Baseball Field");

    }
}
