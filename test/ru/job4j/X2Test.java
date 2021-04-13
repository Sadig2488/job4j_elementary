package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenA1B1C0X0Then1() {


        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;

        int expected = 1;


        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
}