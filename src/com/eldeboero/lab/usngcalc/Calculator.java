package com.eldeboero.lab.usngcalc;
import java.util.*;
import java.lang.*;

public class Calculator {

    double myNorthing;
    double myEasting;

    double getNorthing() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Northing coordinate:");
        return input.nextDouble();
    }

    double getEasting() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Easting coordinate:");
        return input.nextDouble();
    }

    void setNorthing(double northing) {
        System.out.println("Using the following value of Northing: " + northing);
        myNorthing = northing;
    }

    void setEasting(double easting) {
        System.out.println("Using the following value of Easting: " + easting);
        myEasting = easting;
    }

    double getResult() {

        double northingSquared;
        double eastingSquared;
        double hypotenuse;
        return Math.sqrt((myNorthing * myNorthing) + (myEasting * myEasting));
//        return myNorthing / myEasting;
    } 
}
