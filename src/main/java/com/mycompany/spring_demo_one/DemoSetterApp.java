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
        Coach myCricketCoach = context.getBean("myCricketCoach", Coach.class);
        // use the methods
        System.out.println(myCricketCoach.getDailyFortune());
        
        // close the context
        context.close();
    
    }

}
