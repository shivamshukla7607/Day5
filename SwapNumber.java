package com.bridgl.abz;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println ("Enter Frist Number");
        int frist=sc.nextInt ();
        System.out.println ("Enter Second Number");
        int second=sc.nextInt ();
        frist=frist+second;
        second=frist-second;
        frist=frist-second;
        System.out.println ("Your Frist Number :- "+frist );
        System.out.println ("Enter Second Number :- "+second);
    }
}
