package ru.job4j;

public class Fit {

    public static double manWeight(short height) {
        double man = (height - 100) * 1.15;
        return man;
    }

    public static double womanWeight(short height) {
        double woman = (height - 110) * 1.15;
        return woman;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
    }
