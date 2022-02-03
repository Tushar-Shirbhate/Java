package com.company;

public class QueueA{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int size){
            this.size = size;
            arr = new int[size];
            rear = -1;
        }
        public boolean isEmpty(){
            return rear==-1;
        }
        public boolean isFull(){
            return rear==size-1;
        }
        public void push(int data){
            if(isFull()){
                System.out.println("Overflow");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            int front = arr[0];


            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String args[]){
            Queue q = new Queue(5);

            q.push(1);
            q.push(2);
            q.push(3);
            q.push(4);

            while(!q.isEmpty()){
                System.out.print(q.peek() + " ");
                q.remove();
            }
    }
}
