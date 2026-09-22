package com.kst.data_structures.linear.queue;

public interface Queue
{

    public void enqueue(int element);

    public int dequeue();

    public int peek();

    public int getSize();

    public boolean isEmpty();

    public boolean isFull();
}
