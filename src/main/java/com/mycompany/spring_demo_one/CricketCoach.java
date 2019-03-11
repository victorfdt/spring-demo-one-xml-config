/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_demo_one;

/**
 *
 * @author victorfdt
 */
public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach() {
        System.out.println("CricketCoach - inside no-arg constructor.");
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach - Injecting the EmailAddress value: " + emailAddress);
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach - Injecting the team value: " + team);
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Play 2 matches this week.";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    //The setter method for injections
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach - inside the setFortuneService method.");
        this.fortuneService = fortuneService;
    }

}
