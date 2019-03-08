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
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune(){
        return "You will have a great day!";
    }
}
