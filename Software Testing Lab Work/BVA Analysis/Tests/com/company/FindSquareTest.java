package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindSquareTest {
        @Test
        public void testMin(){
            squareFind testObj= new squareFind();
            System.out.println("testing for  min value :0");
            Assert.assertEquals(0,testObj.printSquare(0),1e-4);
        }
        @Test
        public void testMax(){
            squareFind testObj= new squareFind();
            System.out.println("testing for  max value :50");
            Assert.assertEquals(2500,testObj.printSquare(50),1e-4);
        }
        @Test
        public void testMinNext() {
            squareFind testObj = new squareFind();
            System.out.println("testing for  min+1 value :2");
            Assert.assertEquals(4, testObj.printSquare(2),1e-4);
        }
        @Test
        public void testMaxPrev() {
            squareFind testObj = new squareFind();
            System.out.println("testing for  max-1 value :49");
            Assert.assertEquals(2401, testObj.printSquare(49),1e-4);
        }
        @Test
        public void testAvg(){
            squareFind testObj= new squareFind();
            System.out.println("testing for  avg value :25");
            Assert.assertEquals(625,testObj.printSquare(25),1e-4);

        }
        @Test
        public void testMaxNext() {
            squareFind testObj = new squareFind();
            System.out.println("testing for  max+1 value :51");
            Assert.assertEquals(-1, testObj.printSquare(51),1e-4);
        }
        @Test
        public void testMinPrev() {
            squareFind testObj = new squareFind();
            System.out.println("testing for  min-1 value :-1");
            Assert.assertEquals(-1, testObj.printSquare(-1),1e-4);
        }
}


