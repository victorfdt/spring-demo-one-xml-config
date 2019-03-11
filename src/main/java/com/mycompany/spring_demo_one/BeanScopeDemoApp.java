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
public class BeanScopeDemoApp {
    
    public static void main(String args[]){
                
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        
        // retreive the beans from the container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);
        
        // check if they are pointing to the same area in memory
        if(theCoach == alphaCoach){
            System.out.println("They have the same reference");
        } else {
            System.out.println("They have different references");
        }
        
        System.out.println("Memory address for theCoach: " + theCoach);
        System.out.println("Memory address for alphaCoach: " + alphaCoach);
        
        // closing the container
        context.close();
    }
    
}
