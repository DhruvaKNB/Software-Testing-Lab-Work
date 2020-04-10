package com.company;

public class squareFind {
    public void typeOfTest(){
        System.out.println("Boundary value analysis: black box tetsing");
    }
    public float printSquare(int x){
        if(x<0 || x>50) {
            return -1;
        }
        else{
            float ans=x*x;
            return ans;
        }
    }

}
