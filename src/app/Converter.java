package app;

import java.util.Scanner;

public class Converter {
    //  - kilometers - miles
    public static void main(String[] args) {
            double kilometers = 10;
            double miles = kilometersToMiles(kilometers);
            System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");


        }
        public static double kilometersToMiles(double kilometers) {
            double miles = kilometers / 1.609344;
            return miles;

    }
}