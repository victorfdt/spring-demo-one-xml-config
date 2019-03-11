/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_demo_one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author victorfdt
 */
public class DemoSetterApp {

    public static void main(String args[]) {
        // load sring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve beans from the container
        CricketCoach myCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // use the methods
        System.out.println(myCricketCoach.getDailyFortune());
        System.out.println("Email address: "+ myCricketCoach.getEmailAddress());
        System.out.println("Team name: " + myCricketCoach.getTeam());

        // close the context
        context.close();

    }

}
