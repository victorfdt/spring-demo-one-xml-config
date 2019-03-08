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
public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService service) {
		this.fortuneService = service;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5km.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
