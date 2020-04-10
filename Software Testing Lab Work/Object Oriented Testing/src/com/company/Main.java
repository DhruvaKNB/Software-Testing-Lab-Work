package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Series series;
        series = new Fibo(2,3);
        try {
            System.out.println(series.getFirst_term());
            System.out.println(series.getNthTerm(5));
            System.out.println(series.getSumOfNTerms(5));
            System.out.println(series.isTerm(55));
            System.out.println(series.isTerm(87));
        }
        catch (Exception e){
            System.out.println("error");
        }
    }
}
