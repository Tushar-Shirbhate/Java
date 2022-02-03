package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListT {
     public static void main(String args[]){
          ArrayList<Integer> list = new ArrayList<Integer>();

          list.add(1);
          list.add(4);
          list.add(3);
          list.add(5);

          list.add(1,7);

          list.set(2,0);
          list.remove(1);

          System.out.println(list);
          System.out.println(list.size());
          System.out.println(list.get(2));

          for(int i=0; i<list.size(); i++){
               System.out.print(list.get(i) + " ");
          }
          Collections.sort(list);
          System.out.println("\n" + list);
     }
}