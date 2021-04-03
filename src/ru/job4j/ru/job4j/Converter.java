package ru.job4j.ru.job4j;

public class Converter {

        public static int rubleToEuro(int value) {
            int rsl = value / 70;
            return rsl;
        }

        public static int rubleToDollar(int value) {
            int rsl = value / 60;
            return rsl;
        }

        public static void main(String[] args) {

            int in = 180;
            double expected = 3.0;
            double out = Converter.rubleToDollar(in);
            boolean passed = expected == out;
            System.out.println("140 rubles are 2.0 Test result : " + passed);


            int euro = Converter.rubleToEuro(140);
            System.out.println("140 rubles are " + euro + " euro.");
            int dollar = Converter.rubleToDollar(180);
            System.out.println("140 rubles are " + dollar + " dollar.");
        }
    }
