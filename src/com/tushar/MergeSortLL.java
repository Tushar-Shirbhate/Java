package com.tushar;

public class MergeSortLL{
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
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

    Node conquer(Node head1, Node head2){
        Node curr1 = head1;
        Node curr2 = head2;
        Node n = new Node(-1);
        Node newNode = n;

        while(curr1!=null && curr2!=null){
            if(curr1.data<curr2.data){
                newNode.next = curr1;
                curr1 = curr1.next;
                newNode = newNode.next;
            }
            else{
                newNode.next=curr2;
                curr2 = curr2.next;
                newNode = newNode.next;
            }
        }
        while(curr1!=null){
            newNode.next = curr1;
            curr1 = curr1.next;
            newNode = newNode.next;
        }
        while(curr2!=null){
            newNode.next = curr2;
            curr2 = curr2.next;
            newNode = newNode.next;
        }
        return n.next;
    }

    Node divide(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = divide(head);
        Node right = divide(nextOfMiddle);

        Node result = conquer(left, right);
        return result;
    }
    Node getMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
     void printList(){
        Node currNode = head;

        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }
    public static void main(String args[]){
        MergeSortLL list = new MergeSortLL();

        list.addFirst(8);
        list.printList();

        list.addFirst(5);
        list.printList();

        list.addLast(2);
        list.printList();

        list.addLast(9);
        list.printList();

        list.addLast(6);
        list.printList();

        list.addFirst(3);
        list.printList();

        list.addFirst(0);
        list.printList();

        list.addLast(7);
        list.printList();

        list.addFirst(4);
        list.printList();

        list.addFirst(1);
        list.printList();

        list.divide(list.head);
        list.printList();

//        System.out.println(list);
    }
}
