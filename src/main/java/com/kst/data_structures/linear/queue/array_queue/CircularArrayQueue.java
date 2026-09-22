package com.kst.data_structures.linear.queue.array_queue;

import com.kst.data_structures.linear.queue.Queue;

public class CircularArrayQueue implements Queue
{
    private final int[] items;
    private int front;
    private int rear;
    private int size;

    public CircularArrayQueue(int size)
    {
        this.items = new int[size];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    @Override
    public void enqueue(int element)
    {
        if (this.isFull())
        {
            throw new RuntimeException("queue full");
        }

        this.items[this.rear] = element;
        this.rear = (this.rear + 1) % this.items.length;
        size++;
    }

    @Override
    public int dequeue()
    {
        if (isEmpty())
        {
            throw new RuntimeException("queue empty");
        }

        int element = this.items[this.front];
        this.front = (this.front + 1) % this.items.length;
        size--;
        return element;
    }

    @Override
    public int peek()
    {
        if (this.isEmpty())
        {
            throw new RuntimeException("queue empty");
        }
        return this.items[this.front];
    }

    @Override
    public int getSize()
    {
        return this.size;
    }

    @Override
    public boolean isEmpty()
    {
        return this.size == 0;
    }

    @Override
    public boolean isFull()
    {
        return this.rear == this.items.length;
    }
}
