package app;

import java.util.Scanner;

public class Converter {
    //  - kilometers - miles
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter kilometers: ");
            double kilometers = scanner.nextDouble();
            double miles = kilometersToMiles(kilometers);
            System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");


        }
        public static double kilometersToMiles(double kilometers) {
            double miles = kilometers / 1.609344;
            return miles;

    }
}