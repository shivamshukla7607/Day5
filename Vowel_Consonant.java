package com.bridgl.abz;

import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter Charactor");
        char ch=sc.next().charAt (0);
        char[] ch1={'a','e','i','o','u'};
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
}
