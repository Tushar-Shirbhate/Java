package com.tushar;

public class QuickSortLL{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node partition(Node start, Node end){
        if(start==null || start==end || end==null){
            return start;
        }
        Node pivot_prev = start;
        Node curr = start;
        int pivot = end.data;

        while(start!=end){
            if(start.data<pivot){
                pivot_prev = curr;
                int temp = curr.data;
                curr.data = start.data;
                start.data = temp;
                curr = curr.next;
            }
            start = start.next;
        }
        int temp = curr.data;
        curr.data = end.data;
        end.data = temp;

        return pivot_prev;
    }

    void mergeSort(Node start, Node end){
        if(start==null || start==end || start==end.next){
            return;
        }

        Node pivot_prev = partition(start, end);
        mergeSort(start, pivot_prev);

        if(pivot_prev!=null && pivot_prev==start)
            mergeSort(pivot_prev.next, end);

        else if(pivot_prev!=null && pivot_prev.next!=null)
            mergeSort(pivot_prev.next.next, end);
    }
    public static void main(String args[]){

    }
}
