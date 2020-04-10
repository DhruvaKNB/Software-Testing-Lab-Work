package com.company;

public class GP extends Series {
    private float common_ratio;
    public GP(float a, float r){
        this.first_term=a;
        this.common_ratio=r;
    }
    public float getCommon_ratio(){
        return this.common_ratio;
    }
    @Override
    public boolean isTerm(float term) {
        return isInt((float) ((float)Math.log(term/this.first_term)/Math.log(this.common_ratio)));
    }

    @Override
    public float getNthTerm(int n) throws Exception {
        if(n>=1){
            return (float) (this.first_term*Math.pow(this.common_ratio,n-1));
        }
        else{
            System.out.println("Invalid Input...");
            throw new Exception();
        }
    }
}
