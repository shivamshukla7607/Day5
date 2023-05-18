package com.bridgl.abz;

import java.util.Scanner;

public class PowerFind {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter Base Number");
        int base=sc.nextInt ();
        System.out.println ("Enetr the Power Number");
        int power=sc.nextInt ();
        int result =1;
        if (power>0){
            for (int i=1; i<=power; i++){
                result=base*result;
            }
        }
        else {
            System.out.println ("Not Leap Year");
        }
        System.out.println ("Leap Year");
    }
}
