package com.company;

import java.util.Locale;

public class ch14_chp3_Stringmethod {

    public static void main(String[] args){

        String a="Safi ullah khan"; //string cannot be change
        System.out.println(a);
        int value = a.length(); //return string lenght
        System.out.println(value);
       String Lstring=a.toLowerCase();
       System.out.print(Lstring);
       String upercase=a.toUpperCase();
       System.out.print(upercase);

    }
}
