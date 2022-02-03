package com.company;

public class CountSortT{
    public static void countSort(int arr[], int n){
        int count[] = new int[256];

        for(int i=0; i<256; i++){
            count[i] = 0;
        }
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }
        for(int i=1; i<256; i++){
            count[i] += count[i-1];
        }
        int output[] = new int[n];
        for(int i=n-1; i>=0; i--){
            output[--count[arr[i]]] = arr[i];
        }
        for(int i=0; i<n; i++){
            arr[i] = output[i];
        }
    }
    public static void main(String args[]){
        int arr[] = {8,5,2,9,6,3,7,4,1,9,0};
        countSort(arr, arr.length);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
