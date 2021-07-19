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
        
public class RPS {
    public static void main (String[] args)
    {
        int play = 1;
        do
        {
            Scanner in = new Scanner(System.in);
            Random rand = new Random();

            int computerWin = 0;
            int playerWin = 0;
            int tie = 0;

            System.out.println("How many rounds would you like to play?");
            int rounds = in.nextInt();
            if(rounds < 1 || rounds > 10)
            {
                System.out.println("Error! Round is not within range");
                System.exit(0);
            }

            int choice;
            int n;
            for(int i = 1; i <= rounds; i++)
            {       
               System.out.println("Please choose on the following: 1 = Rock, 2 = Paper, 3 = Scissors");
               choice = in.nextInt();

               n = rand.nextInt(3) + 1;

               if(n == choice){
                tie++;
               }

               else if(choice - n == 1){
                playerWin++;

               }

               else if(choice - n == -2){
                playerWin++;
               }

               else{
                computerWin++;
               }

            }

            System.out.println("Computer Wins: " + computerWin);
            System.out.println("Player Wins: " + playerWin);
            System.out.println("Tied Games: " + tie);
            
            System.out.println("Would you like to play more? 1 = Yes, 2 = No");
            play = in.nextInt();
        } while(play == 1);
       
        System.out.println("Thanks for playing!");
    }
}
