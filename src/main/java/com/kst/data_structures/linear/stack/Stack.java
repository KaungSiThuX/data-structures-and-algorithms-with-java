package com.kst.data_structures.linear.stack;

public class Stack
{

    private int top;
    private int[] items;

    public Stack(int size)
    {
        this.items = new int[size];
        this.top = -1;
    }

    void push(int element)
    {
        if (this.isFull())
        {
            throw new RuntimeException("stack full");
        }

        this.items[++top] = element;
    }


    int pop()
    {
        if (this.isEmpty())
        {
            throw new RuntimeException("stack empty");
        }

        return this.items[top--];
    }

    int peek()
    {
        if (this.isEmpty())
        {
            throw new RuntimeException("stack empty");
        }

        return this.items[top];
    }


    boolean isEmpty()
    {
        return this.top == -1;
    }


    boolean isFull()
    {
        return this.items.length - 1 == this.top;
    }


    int getSize()
    {
        return this.top + 1;
    }
}
