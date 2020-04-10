package com.company;

import org.junit.Assert;
import org.junit.Test;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;

import static org.junit.Assert.*;

public class APTest extends SeriesTest {

    @Test
    public void testGetCommon_difference() {
        Random r = new Random();
        float x = r.nextFloat();
        Series s = new AP(2,x);
        Assert.assertEquals(x, ((AP) s).getCommon_difference(),1e-4);
    }

    @Test
    public void isTerm() throws Exception {
        Random r = new Random();
        float a = r.nextFloat();
        float d = r.nextFloat();
        Series s = new AP(a,d);
        int n = r.nextInt(1000);
        float term = a + (n-1)*d;
        Assert.assertTrue(s.isTerm(term));
        term += d/2;
        Assert.assertFalse(s.isTerm(term));
    }

    @Test
    public void getNthTerm() throws Exception {
        Random r = new Random();
        float a = r.nextFloat();
        float d = r.nextFloat();
        Series s = new AP(a,d);
        int n = r.nextInt(1000);
        float term = a + (n-1)*d;
        Assert.assertEquals(term,  s.getNthTerm(n),1e-4);
    }
    @Test
    public void getFirst_term(){
        Random r = new Random();
        float x = r.nextFloat();
        Series s = new AP(x,2);
        Assert.assertEquals(x, s.getFirst_term(),1e-4);

    }
}