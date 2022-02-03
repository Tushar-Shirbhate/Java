package com.company;

public class QueueLL{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }
        public static void add(int data){
            Node newNode = new Node(data);

            if(isEmpty()){
                head = tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            if(head==tail){
                tail = null;
            }
            int res = head.data;
            head = head.next;
            return res;
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
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
