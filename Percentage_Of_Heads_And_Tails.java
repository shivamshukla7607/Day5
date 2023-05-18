package com.bridgl.abz;

import java.util.Scanner;

public class Percentage_Of_Heads_And_Tails {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int numFlips = 0;
        int heads = 0;
        int tails = 0;
        String answer;

        System.out.print ("Please Enter The Number Of Coin Tosses You Want: ");
        numFlips = input.nextInt ();

        for (int x = 1; x <= numFlips; x++) {
            double coinToss = Math.random ();
            if (coinToss <= 0.5) {
                answer = "Tails";
                tails++;
            } else {
                answer = "Heads";
                heads++;
            }
            System.out.println ("Coin Toss " + x + ": " + answer);
        }
        System.out.println (" Percentage of tails :-  "+(tails*100)/numFlips +"%");
        System.out.println (" Percentage of Heads :-  "+(heads*100)/numFlips +"%");
        }
}

