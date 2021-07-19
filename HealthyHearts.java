/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mthree.helloworlds;

/**
 *
 * @author sithero
 */

import java.util.Scanner;
public class HealthyHearts {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = in.nextInt();
        int maxHeart = 220 - age;
        int zoneMin = maxHeart/2;
        int zoneMax = maxHeart*0.85;
        
        System.out.println("Your maximum heart rate should be " + maxHeart + " beats per minute");
        System.out.println("Your target HR Zone is " + zoneMin + " - " + zoneMax + " beats per minute")
    }
}
