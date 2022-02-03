package com.tushar;

import java.util.Collections;
import java.util.LinkedList;

public class SelectionSort {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("Tushar");
       // list.printList();
        list.addFirst("Yash");
       // list.printList();
        list.addLast("Sanket");
      //  list.printList();
        list.addLast("Rahul");
       // list.printList();
       // list.reverse();
       // list.printList();
        list.removeFirst();
        //list.printList();
        list.removeLast();
      //  list.printList();
      //  System.out.println(list.getSize());
        LinkedList<Integer> list2 = new LinkedList();
        list2.add(2);
        list2.add(3);
        Collections.reverse(list2);
        System.out.println(list2);
    }
}
