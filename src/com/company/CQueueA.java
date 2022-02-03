package com.company;

public class CQueueA {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int size){
            this.size = size;
            arr = new int[size];
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Overflow");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            int res = arr[front];
            if(front == rear){
                front = rear = -1;
            }
            else{
                front = (front + 1)%size;
            }
            return res;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
