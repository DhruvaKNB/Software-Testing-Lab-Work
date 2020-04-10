package com.company;

public class QuickSort {

    private int[] arr;

    public QuickSort(int[] arr) {
        int n = arr.length;
        this.arr = new int[n];
        for(int i=0;i<n;i++){
            this.arr[i] = arr[i];
        }
    }

    public int[] getArr() {
        return arr;
    }
    public int partition(){
        return partition(0,arr.length-1);
    }
    private int partition(int low,int  high){
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    private void Sort(int low,int high)
    {
        if (low < high)
        {
            int pi = partition(low, high);
            Sort(low, pi-1);
            Sort(pi+1, high);
        }
    }
    public void Sort(){
        Sort(0,arr.length-1);
    }
}
