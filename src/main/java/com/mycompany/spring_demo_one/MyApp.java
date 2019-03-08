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
public class MyApp {
    
    public static void main(String[] args) {
        
        Coach coach = new BaseballCoach();
        
        System.out.println(coach.getDailyWorkout());
        
    }
    
}
