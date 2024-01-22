package app;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter miles: ");
        double miles = scanner.nextDouble();
        double kilometers = milesToKilometers(miles);
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    }

    public static double milesToKilometers(double miles) {
        double kilometers = miles * 1.609344;
        return kilometers;



    }
}