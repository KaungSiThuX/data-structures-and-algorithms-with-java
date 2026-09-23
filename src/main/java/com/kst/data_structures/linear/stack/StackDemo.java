package com.kst.data_structures.linear.stack;

public class StackDemo
{
    static void main()
    {
        Stack stack = new Stack(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("stack size " + stack.getSize() + " peek is " + stack.peek());

        System.out.println("pop " + stack.pop());

        System.out.println("stack size " + stack.getSize() + " peek is " + stack.peek());
    }
}
