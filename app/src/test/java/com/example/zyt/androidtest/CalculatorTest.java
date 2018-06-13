package com.example.zyt.androidtest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author mi
 * @date 18-6-13
 */
public class CalculatorTest {

    private Calculator mCalculator;

    @Before
    public void setUp() throws Exception {
        mCalculator = new Calculator();
    }

    @Test
    public void sum() {
        Assert.assertEquals(6, mCalculator.sum(1, 5), 0);
    }

    @Test
    public void sub() {
        Assert.assertEquals(4, mCalculator.sub(5, 1), 0);
    }

    @Test
    public void multiply() {
        Assert.assertEquals(5, mCalculator.multiply(1, 5), 0);
    }

    @Test
    public void divide() {
        Assert.assertEquals(5, mCalculator.divide(5, 1), 0);
    }
}