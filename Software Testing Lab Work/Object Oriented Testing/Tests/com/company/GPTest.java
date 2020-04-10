package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class GPTest extends SeriesTest {

    @Test
    public void getCommon_ratio() {
        Random r = new Random();
        float x = r.nextFloat();
        Series s = new GP(2,x);
        Assert.assertEquals(x, ((GP) s).getCommon_ratio(),1e-4);
    }

    @Test
    public void isTerm() throws Exception {
        Random r = new Random();
        float a = 2;
        float d = (float) 1.5;
        Series s = new GP(a,d);
        int n = 5;
        float term = (float) (a*Math.pow(d,n-1));
        Assert.assertTrue(s.isTerm(term));
        term *= d/2;
        Assert.assertFalse(s.isTerm(term));
    }

    @Test
    public void getNthTerm() throws Exception {
        Random r = new Random();
        float a = 2;
        float d = (float) 1.5;
        Series s = new GP(a,d);
        int n = 5;
        float term = (float) (a*Math.pow(d,n-1));
        Assert.assertEquals(term,  s.getNthTerm(n),1e-4);
    }
    @Test
    public void getFirst_term(){
        Random r = new Random();
        float x = r.nextFloat();
        Series s = new GP(x,2);
        Assert.assertEquals(x, s.getFirst_term(),1e-4);
    }
}