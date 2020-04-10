package com.company;

public class Series {
    public Series(){
        this.first_term=0;
    }
    protected float first_term;
    public  boolean isTerm(float term) throws Exception{
        return (term==0);
    };
    public  float getNthTerm(int n) throws Exception{
        return 0;
    };
    public float getSumOfNTerms(int n) throws Exception{
        if(n>=1){
            float sum = 0;
            for(int i=1;i<=n;i++){
                sum+=getNthTerm(i);
            }
            return sum;
        }
        else{
            System.out.println("Invalid Input...");
            throw new Exception();
        }
    }
    public float getFirst_term(){
        return this.first_term;
    }
    protected boolean isInt(float val){
        return (Math.abs(Math.round(val) - val)<=1e-4)&&(Math.abs(val)>=1e-4);
    }
}
