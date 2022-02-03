package com.company;

import java.util.Stack;

public class StackJCF{
    public static void main(String args[]){
        Stack<Integer> st = new Stack<Integer>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st.peek());

        while (!st.isEmpty()) {

            System.out.print(st.pop() + " ");
        }
    }
}
