package com.company;

public class Fibo extends Series {
    private float second_term;
    public Fibo(float a,float b){
        if((a>=0)&&(b>=0)) {
            this.first_term = a;
            this.second_term = b;
        }
        else{
            this.first_term=0;
            this.second_term=1;
        }
    }
    @Override
    public boolean isTerm(float term) throws Exception {
        boolean found=false;
        float c = getNthTerm(1);
        int cc=1;
        while ((!found)&&(c<=term)){
            if (Math.abs(c-term)<=1e-4) {
                found = true;
            }
            cc++;
            c = getNthTerm(cc);
        }
        return found;
    }

    @Override
    public float getNthTerm(int n) throws Exception {
        if(n==1){
            return this.first_term;
        }
        else if(n==2){
            return this.second_term;
        }
        else if(n>2){
            float p = this.second_term;
            float pp = this.first_term;
            float c = 0;
            while(n>2){
                c = p+pp;
                pp=p;
                p=c;
                n--;
            }
            return c;
        }
        else{
            System.out.println("Invalid Input...");
            throw new Exception();
        }
    }

    public float getSecond_term() {
        return second_term;
    }
}
