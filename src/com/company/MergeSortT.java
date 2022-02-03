package com.company;

public class MergeSortT{
    public static void conquer(int arr[], int st, int mid, int en){
        int idx1 = st;
        int idx2 = mid+1;
        int x=0;
        int merged[] = new int[en-st+1];
        while(idx1<=mid && idx2<=en){
            if(arr[idx1]<arr[idx2]){
                merged[x++] = arr[idx1++];
            }
            else{
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++] = arr[idx1++];
        }
        while(idx2<=en){
            merged[x++] = arr[idx2++];
        }

        for(int i=0, j=st; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int arr[], int st, int en){
        if(st>=en){
            return;
        }
        int mid = st + (en-st)/2;
        divide(arr, st, mid);
        divide(arr, mid+1, en);
        conquer(arr, st, mid, en);
    }
    public static void main(String args[]){
        int arr[] ={8,5,3,6,1,2,4,9,0};
        divide(arr, 0, arr.length-1);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
