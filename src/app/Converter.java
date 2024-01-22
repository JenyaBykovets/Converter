package app;

public class Converter {
    public static void main(String[] args) {
        double miles = 10;
        double kilometers = milesToKilometers(miles);
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    }

    public static double milesToKilometers(double miles) {
        double kilometers = miles * 1.609344;
        return kilometers;


    }
}