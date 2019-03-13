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
public class BeanLifecycleDemoApp {

    public static void main(String args[]) {
        
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

        // retreive the beans from the container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyFortune());
        
        // close the context
        context.close();
    }

}
