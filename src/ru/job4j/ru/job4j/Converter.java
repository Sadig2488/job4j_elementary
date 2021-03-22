package ru.job4j.ru.job4j;

public class Converter {

        public static int rubleToEuro(int value) {
            int rsl = value / 70;
            return rsl;
        }

        public static double rubleToDollar(double value) {
            double rsl = value / 60;
            return rsl;
        }

        public static void main(String[] args) {

            int in = 120;
            double expected = 2.0;
            double out = Converter.rubleToDollar(in);
            boolean passed = expected == out;
            System.out.println("140 rubles are 2.0 Test result : " + passed);


            int euro = Converter.rubleToEuro(140);
            System.out.println("140 rubles are " + euro + " euro.");
            double dollar = Converter.rubleToDollar(120);
            System.out.println("140 rubles are " + dollar + " dollar.");
        }
    }
