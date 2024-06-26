package com.company;

import java.util.Scanner;

public class ch_19_Conditional {
    public static void main(String[] args) {
     //check whether student is passed or fialed passing marks is 33%
        Scanner scanner = new Scanner(System.in);
        //total marks for each subject is
        int totalmarks = 100;
        double passingPercentage = 33.0;
        //calculate passing marks

        double passingmarks = totalmarks * passingPercentage /100;
        //input the marks for the subject
        System.out.print("enter the marks for the subj" + 1);
        double subject1= scanner.nextDouble();

        System.out.print("enter the marks for the subj" + 2);
        double subject2= scanner.nextDouble();

         System.out.print("enter the marks for the subj" + 2);
         double subject3= scanner.nextDouble();
         //check if the stundent has pass in the subject
        if(subject1>=passingmarks && subject2>=passingmarks && subject3>=passingmarks){
            System.out.print("Student is passed");
        }
       else {
           System.out.print("Student is failed");
        }


    }
}
