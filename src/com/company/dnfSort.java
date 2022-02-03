package com.company;

public class dnfSort {

//    static void swap(int a, int b){
//       a = a+b;
//       b = a-b;
//       a= a-b;
//    }
    static void dnfSort(int arr[], int n){
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            if(arr[mid]==0){
//                swap(arr[low], arr[mid]);
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++; mid++;
            }
            if(arr[mid]==1){
                mid++;
            }
            if(arr[mid]==2){
//                swap(arr[mid], arr[high]);
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {2,1,2,2,0,1,2,0,1,2,0};
        dnfSort(arr,arr.length);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
