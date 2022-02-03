package com.company;

import java.util.*;

class LinkedListT{
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();

        list.add("Tushar");
        list.add("Yash");
        list.addFirst("Rahul");
        list.addLast("Atharva");

        list.add(2, "Sanket");

        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());

        list.remove(2);
        list.removeFirst();
        list.removeLast();

        System.out.println(list);

    }
}
