package com.company;

public class Ch27_for_each_loop {

    public static void  main(String[] args){
        int marks[] = { 1,3,4,5,6};
        System.out.println(marks.length);
        //display array element using for loops
        for(int i=0; i< marks.length; i++){
            System.out.println(i);

            // printing array in reverse order
            for (int h=marks.length-1; h>=0; h--){
                System.out.println("reverse order printing array " + h);
            }
            //dis[lay element using for each loop advanced version of for loops
            for (int element: marks){
                System.out.println(element);
            }
        }
    }
    }



