package com.company;

class DoublyLinkedListT1{
    Node head;
    private int size;

    DoublyLinkedListT1(){
        size = 0;
    }

    public class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        newNode.prev = null;

        if(head != null){
            head.prev = newNode;
        }

        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }

        Node curr = head;

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.prev = curr;
    }

    public void printList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){
        head = head.next;
        head.prev = null;
    }

    public static void main(String args[]){
        DoublyLinkedListT1 list = new DoublyLinkedListT1();
        list.addFirst(2);
        list.printList();

        list.addLast(3);
        list.printList();

        list.addFirst(1);
        list.printList();

        list.addLast(4);
        list.printList();

        list.deleteFirst();
        list.printList();
    }
}
