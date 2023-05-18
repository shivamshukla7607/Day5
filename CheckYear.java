package com.bridgl.abz;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enetr Year");
        int year=sc.nextInt ();
        if (year%4==0 && year%100!=.0){
            System.out.println (year+" Is Leap Year");
        }
        else {
            System.out.println (year+" Is not Leap Year");
        }
    }
}
