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
        
public class RPS {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many rounds would you like to play?");
        int rounds = in.nextInt();
        if(rounds < 1 || rounds > 10)
        {
            System.out.println("Error! Round is not within range");
            System.exit(0);
        }
        
        
    }
}
