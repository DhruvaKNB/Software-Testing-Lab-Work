package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class FiboTest extends SeriesTest {

    @Test
    public void isTerm() throws Exception {
        Series series = new Fibo(2,3);
        Assert.assertTrue(series.isTerm(55));
        Assert.assertFalse(series.isTerm(67));
    }

    @Test
    public void getNthTerm() throws Exception {
        Series series = new Fibo(2,3);
        Assert.assertTrue(series.getNthTerm(5)==13);
        Assert.assertFalse(series.getNthTerm(5)==32);
    }

    @Test
    public void getSecond_term() {
        Random r = new Random();
        float x = r.nextFloat();
        Series s = new Fibo(2,x);
        Assert.assertEquals(x, ((Fibo) s).getSecond_term(),1e-4);
    }
    @Test
    public void getFirst_term(){
        Random r = new Random();
        float x = r.nextFloat();
        Series s = new Fibo(x,2);
        Assert.assertEquals(x, s.getFirst_term(),1e-4);
    }
}