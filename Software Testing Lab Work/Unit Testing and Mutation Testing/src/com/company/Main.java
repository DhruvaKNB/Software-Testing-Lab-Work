package com.company;

public class Main {
    public static void main(String [] args){
        // write your code here
        int[] arr = {1,-9,112,98,2,-76,1977,45,69,78,90,-976,34,3,5,-1,2};
        QuickSort obj = new QuickSort(arr);
        obj.Sort();
        arr = obj.getArr();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }
}
