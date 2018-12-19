package com.eldeboero.lab.usngcalc;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // USNGCalc - a utility to calculate distance between USNG coordinates
        System.out.println("USNGCalc - Calculators are phun!");
        Calculator calculator = new Calculator();
        double Result;

        //Get the input
        //Need some error handling for InputMismatchException
        double easting = calculator.getEasting();
        double northing = calculator.getNorthing();

        //Put the values in the calculator, and then get the result

        calculator.setEasting(easting);
        calculator.setNorthing(northing);
        Result = calculator.getResult();

        System.out.print("The result is (to 5 decimals): ");
        System.out.printf("%.5f", Result);


    }
}
