package ru.job4j.ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {

        int in = 140;
        int expected;
        expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void whenConvert180RblThen3Dollars() {

        int in = 180;
        int expected = 3;
        int out;
        out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);

    }
}