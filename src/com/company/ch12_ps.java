package com.company;

import java.util.Scanner;

public class ch12_ps {
    public static void main(String[] args){
        float a =7/4.0f*9/2.0f;  // first clc / and then * due to same precendence and associative
        System.out.println(a);

        // parogram to encrypt the grade by adding 8 to it
         char grade='b';
         grade=(char)(grade + 8);
         System.out.println("encrypted grade" +grade);
         //decrypt the grade
        grade =(char) (grade-8);
        System.out.println("derypt grade" +grade);
        int u=7;
        int v=5;
        int s=9;
        int y=8;

        float t=(u*u-v*v)/2*s*y;
        System.out.println("value of t is "+t);




    }
}
