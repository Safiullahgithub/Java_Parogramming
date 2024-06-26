package com.company;

public class ch21_chp4_loops {
    public static void main(String[] args) {

//        for (int i=100; i<=200; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//                i++;

//        updated version
        for (int i = 101; i <= 199; i += 2) {
            System.out.println(i);
        }

        int count = 0;
        while (count <= 6) {
            System.out.println("the value of the count is " + count);
            count++;
        }

        //do while loops
        int count1 = 0;
        do {
            System.out.println("count1 values is " + count1);
            count1++;
        } while (count1 < 4);

        int y;
        for (y = 0; y < 6; y++) {
            System.out.println(y);
            System.out.println("break when y == 4");
            if (y == 4) {
            break;
        }
    }}}

