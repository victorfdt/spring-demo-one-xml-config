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
public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	public BaseballCoach() {
	};

	/**
	 * In the configuration file I'm injection the class HappyFortuneService
	 * 
	 * @param service
	 */
	public BaseballCoach(FortuneService service) {
		this.fortuneService = service;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 min running";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
}
