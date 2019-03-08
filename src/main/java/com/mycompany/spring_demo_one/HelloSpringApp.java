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
public class HelloSpringApp {

    public static void main(String args[]) {

        //Load de Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Retrive the bean from the container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach theOtherCoach = context.getBean("myOtherCoach", Coach.class);
        
        
        //Call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theOtherCoach.getDailyWorkout());
        
        //Close the contex
        context.close();

    }

}
