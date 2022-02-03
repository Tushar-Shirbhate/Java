package com.company;

class CL{
    Node head;
    private int size;

    CL(){
        size = 0;
    }

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            newNode.next = newNode;
            head = newNode;
            return;
        }
         Node curr = head;

         while(curr.next != head){
             curr = curr.next;
         }
         curr.next = newNode;
         newNode.next = head;
         head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            newNode.next = newNode;
            head = newNode;
            return;
        }
        Node curr = head;

        while(curr.next != head){
          curr = curr.next;
        }

        curr.next = newNode;
        newNode.next = head;
    }

    public void deleteFirst(){
        if(head == null && head.next == null){
            return;
        }
        Node curr = head;

        while(curr.next != head){
            curr = curr.next;
        }
        curr.next = head.next;
        head = head.next;
    }

    public static void main(String args[]){

    }
}
