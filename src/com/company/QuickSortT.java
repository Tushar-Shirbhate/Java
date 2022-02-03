package com.company;

public class QuickSortT{
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i=low-1;

        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int arr[], int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    public static void main(String args[]){
        int arr[] = {8,5,2,1,6,3,7,4,9,0};

        quickSort(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
