package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan187ThenWeight() {

        short height = 187;
        double expected = 100.05;
        double rsl = Fit.manWeight(height);
        Assert.assertEquals(expected, rsl, 0.01);


    }

    @Test
    public void whenWoman187ThenWeight() {

        short height = 187;
        double expected = 88.55;
        double rsl = Fit.womanWeight(height);
        Assert.assertEquals(expected, rsl, 0.01);

    }
}