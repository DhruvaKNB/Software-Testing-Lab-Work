package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class SeriesTest implements ISeriesTest{

    @Test
    public void isTerm() throws Exception {
        Series s = new Series();
        Assert.assertTrue(s.isTerm(0));
        Assert.assertFalse(s.isTerm(2));
    }

    @Test
    public void getNthTerm() throws Exception {
        Series s = new Series();
        Assert.assertTrue(s.getNthTerm(5)==0);
    }

    @Test
    public void getSumOfNTerms() throws Exception {
        Series s = new Series();
        Random r = new Random();
        int x = r.nextInt(100);
        if (x >= 2) {
            Assert.assertTrue(Math.abs(s.getSumOfNTerms(x) - s.getSumOfNTerms(x - 1) - s.getNthTerm(x)) <= 1e-4);
        }
        else{
            Assert.assertTrue(Math.abs(s.getSumOfNTerms(7) - s.getSumOfNTerms(7- 1) - s.getNthTerm(7)) <= 1e-4);
        }
    }

    @Test
    public void getFirst_term() {
        Series s = new Series();
        Assert.assertTrue(s.getFirst_term()==0);
    }
}