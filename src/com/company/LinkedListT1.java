package com.company;

import java.util.*;

class LinkedListT1 {

    Node head;
    private int size;

    LinkedListT1(){
        size = 0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node lastNode = head;

        while(lastNode.next != null){
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }

    public void printList(){
        Node currNode = head;

        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("This is an Empty list");
            return;
        }

        head = this.head.next;
        size--;
    }

    public void removeLast(){
        if(head == null){
            System.out.println("This is an Empty list");
            return;
        }

        Node currNode = head;
        Node nextNode = head.next;

        while(nextNode.next != null){
            currNode = currNode.next;
            nextNode = nextNode.next;
        }
        currNode.next = null;
        size--;

    }
    public int getSize(){
        return size;
    }

    public void reverse(){
        if(head == null || head.next == null){
            return;
        }

        Node prev = head;
        Node curr = head.next;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
    }

    public Node getMiddle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }

    public boolean isPalindrome(Node head){
        if(head == null || head.next == null){
            return true;
        }
        Node firstHalfEnd = getMiddle(head);

        Node firstHalfStart = head;
        Node secondHalfStart = reverse(firstHalfEnd.next);

        while(firstHalfStart != null && secondHalfStart != null){
            if(firstHalfStart != secondHalfStart){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }

    public boolean hasCycle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]){
        LinkedListT1 list = new LinkedListT1();

        list.addFirst("Tushar");
        list.printList();

        list.addFirst("Yash");
        list.printList();

        list.addLast("Sanket");
        list.printList();

        list.addLast("Rahul");
        list.printList();

       // System.out.println(list.isPalindrome(list.isPalindrome(list.get(0))));

        list.reverse();
        list.printList();

        list.removeFirst();
        list.printList();

        list.removeLast();
        list.printList();

        System.out.println(list.getSize());

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(2);
        list2.add(3);
        Collections.reverse(list2);
        System.out.println(list2);
    }
}

/*
1 2 3 4




*/



