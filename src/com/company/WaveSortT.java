package com.company;

public class WaveSortT{
    public static void waveSort(int arr[], int n){
        for(int i=1; i<n; i+=2){
            if(arr[i]>arr[i-1]){
                int temp =arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
            if(arr[i]>arr[i+1] && i<=n-2){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {8,5,2,9,6,3,7,4,1,9,0};
        waveSort(arr,arr.length);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
