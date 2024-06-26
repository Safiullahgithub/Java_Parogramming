package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ch_26_Array {


   public static <numbers> void main(String[] args){
//       int[] numbers;
//       numbers = new int[4];
       // or we can also declare in one line
//       int[] numbers= new int[5]; // you can also intialize the array int[] number={1,3,5,5}
//       //or
//       numbers[0]=100;
//       numbers[1]=56;
//       numbers[2]=57;
//       numbers[3]=45;
//       numbers[4]=55;
//       System.out.println(numbers[0]);

       int[] marks={1,3,4,5,6};
       for(int i = 0; i<=marks.length; i++)
       System.out.println(i);

       List<Integer> number=new ArrayList<Integer>();
       number.add(34);



   }
}
