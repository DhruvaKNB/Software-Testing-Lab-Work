package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;



public class QuickSortTest {

    @Test
    public void getArr() {
        Random rand = new Random();
        int n = rand.nextInt(1000000);
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = rand.nextInt(100000);
        }
        QuickSort sorter = new QuickSort(arr);
        Assert.assertArrayEquals(arr,sorter.getArr());
    }

    @Test
    public void partition() {
        Random rand = new Random();
        int n = rand.nextInt(1000000);
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = rand.nextInt(100000);
        }
        QuickSort sorter = new QuickSort(arr);
        int p = sorter.partition();
        arr = sorter.getArr();
        for(int i=0;i<=p;i++){
            Assert.assertTrue(arr[i]<=arr[p]);
        }
        for(int j=p+1;j<arr.length;j++){
            Assert.assertTrue(arr[j]>=arr[p]);
        }
    }

    @Test
    public void sort() {
        Random rand = new Random();
        int n = rand.nextInt(1000000);
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = rand.nextInt(100000);
        }
        QuickSort sorter = new QuickSort(arr);
        sorter.Sort();
        int []sorted = sorter.getArr();
        for(int i=1;i<sorted.length;i++){
            Assert.assertTrue(sorted[i]>=sorted[i-1]);
        }
    }
}