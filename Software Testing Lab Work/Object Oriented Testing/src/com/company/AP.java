package com.company;

public class AP extends Series {
    private float common_difference;
    public AP(float a , float d){
        this.first_term=a;
        this.common_difference=d;
    }
    public float getCommon_difference(){
        return this.common_difference;
    }
    @Override
    public boolean isTerm(float term) {
        return isInt((term - this.first_term)/this.common_difference);
    }

    @Override
    public float getNthTerm(int n) throws Exception {
        if (n>=1) {
            return this.first_term + (n - 1) * this.common_difference;
        }
        else{
            System.out.println("Invalid Input...");
            throw new Exception();
        }
    }
}
