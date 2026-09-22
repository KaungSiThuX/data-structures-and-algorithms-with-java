package com.kst.data_structures.linear.queue.array_queue;

public class CircularArrayQueueDemo
{
    static void main()
    {
        CircularArrayQueue circularArrayQueue = new CircularArrayQueue(3);
        circularArrayQueue.enqueue(10);
        circularArrayQueue.enqueue(20);
        circularArrayQueue.enqueue(30);

        System.out.println("current size " + circularArrayQueue.getSize() + " peek " + circularArrayQueue.peek());

        circularArrayQueue.dequeue();
        circularArrayQueue.dequeue();

        System.out.println("peek" + circularArrayQueue.peek());

        circularArrayQueue.dequeue();

        System.out.println("current size " + circularArrayQueue.getSize());

        circularArrayQueue.enqueue(40);

        System.out.println("peek is " + circularArrayQueue.peek() + " size " + circularArrayQueue.getSize());
    }
}
