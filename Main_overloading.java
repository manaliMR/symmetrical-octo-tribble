package com.myCompany;

public class Main {

    public static void main(String[] args) {

        calcFeetandInchesToCentimeters(2,0);
        calcFeetandInchesToCentimeters(3.4);



    }

    public static double calcFeetandInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 || (inches >= 0 || inches <= 12)) {
            double c1 = (feet * 12 ) * 2.4;
            c1 += inches * 2.4;
            System.out.println("the centimeter value is : "+ c1);
            return c1;
        } else {
            return -1;
        }
    }

    public static double calcFeetandInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double f = inches / 12;
            System.out.println("inches to centimeter: " + f);
            return f;


        } else {
            return -1;
        }

    }

}

