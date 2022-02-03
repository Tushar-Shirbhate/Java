package com.tushar;

import java.util.Collections;
import java.util.LinkedList;

class LinkedListT1 {
    LinkedListT1.Node head;
    private int size = 0;

    LinkedListT1() {
    }

    public void addFirst(String data) {
        LinkedListT1.Node newNode = new LinkedListT1.Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void addLast(String data) {
        LinkedListT1.Node newNode = new LinkedListT1.Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            LinkedListT1.Node lastNode;
            for(lastNode = this.head; lastNode.next != null; lastNode = lastNode.next) {
            }

            lastNode.next = newNode;
        }
    }

    public void printList() {
        for(LinkedListT1.Node currNode = this.head; currNode != null; currNode = currNode.next) {
            System.out.print(currNode.data + " -> ");
        }

        System.out.println("null");
    }

    public void removeFirst() {
        if (this.head == null) {
            System.out.println("This is an Empty list");
        } else {
            this.head = this.head.next;
            --this.size;
        }
    }

    public void removeLast() {
        if (this.head == null) {
            System.out.println("This is an Empty list");
        } else {
            LinkedListT1.Node currNode = this.head;

            for(LinkedListT1.Node nextNode = this.head.next; nextNode.next != null; nextNode = nextNode.next) {
                currNode = currNode.next;
            }

            currNode.next = null;
            --this.size;
        }
    }

    public int getSize() {
        return this.size;
    }

    public void reverse() {
        if (this.head != null && this.head.next != null) {
            LinkedListT1.Node prev = this.head;

            LinkedListT1.Node next;
            for(LinkedListT1.Node curr = this.head.next; curr != null; curr = next) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
            }

            this.head.next = null;
            this.head = prev;
        }
    }

    public LinkedListT1.Node getMiddle(LinkedListT1.Node head) {
        LinkedListT1.Node fast = head;

        LinkedListT1.Node slow;
        for(slow = head; fast.next != null && fast.next.next != null; fast = fast.next.next) {
            slow = slow.next;
        }

        return slow;
    }

    public LinkedListT1.Node reverse(LinkedListT1.Node head) {
        LinkedListT1.Node prev = null;

        LinkedListT1.Node next;
        for(LinkedListT1.Node curr = head; curr != null; curr = next) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
        }

        return prev;
    }

    public boolean isPalindrome(LinkedListT1.Node head) {
        if (head != null && head.next != null) {
            LinkedListT1.Node firstHalfEnd = this.getMiddle(head);
            LinkedListT1.Node firstHalfStart = head;

            for(LinkedListT1.Node secondHalfStart = this.reverse(firstHalfEnd.next); firstHalfStart != null && secondHalfStart != null; secondHalfStart = secondHalfStart.next) {
                if (firstHalfStart != secondHalfStart) {
                    return false;
                }

                firstHalfStart = firstHalfStart.next;
            }

            return true;
        } else {
            return true;
        }
    }

    public boolean hasCycle(LinkedListT1.Node head) {
        LinkedListT1.Node fast = head;
        LinkedListT1.Node slow = head;

        while(fast.next != null && fast.next.next != null) {
            fast = fast.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        LinkedListT1 list = new LinkedListT1();
        list.addFirst("Tushar");
        list.printList();
        list.addFirst("Yash");
        list.printList();
        list.addLast("Sanket");
        list.printList();
        list.addLast("Rahul");
        list.printList();
        list.reverse();
        list.printList();
        list.removeFirst();
        list.printList();
        list.removeLast();
        list.printList();
        System.out.println(list.getSize());
        LinkedList<Integer> list2 = new LinkedList();
        list2.add(2);
        list2.add(3);
        Collections.reverse(list2);
        System.out.println(list2);
    }

    public class Node {
        String data;
        LinkedListT1.Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            ++LinkedListT1.this.size;
        }
    }
}

