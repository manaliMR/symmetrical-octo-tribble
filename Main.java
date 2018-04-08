package com.myCompany;

public class Main {

    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 80;
        double addmul = (num1 + num2) * 25 ;
        double reminder = addmul % 40 ;
        System.out.println("the reminder is: " + reminder);

        if(reminder<=20)
            System.out.println("Total was over limit");

    }
}
