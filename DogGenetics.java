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
import java.util.Random;

public class DogGenetics {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("What is your dog's name: ")
        String name = in.nextLine();
        
        String [] breeds = {"% St. Bernard", "% Chihuahua", "% Dramatic RedNosed Asian Pug", "% Common Cur", "% King Doberman"};
        int max = 101;
        int percentage;
        
        for(int i = 0; i < breeds.length - 1; i++){
            percentage = rand.nextInt(max);
            System.out.println(percentage + breeds[i]);

            max = max - percentage;
        }
        
        System.out.println(max + breeds[4]);
    }
}