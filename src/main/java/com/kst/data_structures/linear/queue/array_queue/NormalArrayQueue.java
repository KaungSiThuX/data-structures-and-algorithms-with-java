package com.kst.data_structures.linear.queue.array_queue;

import com.kst.data_structures.linear.queue.Queue;

public class NormalArrayQueue implements Queue
{

    private final int[] items;
    private int front;
    private int rear;
    private int size;

    public NormalArrayQueue(int size)
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

        this.items[this.rear++] = element;
        this.size++;
    }

    @Override
    public int dequeue()
    {
        if (this.isEmpty())
        {
            throw new RuntimeException("queue empty");
        }
        size--;
        return this.items[this.front++];
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
