package com.kst.data_structures.linear.queue.array_queue;

public class NormalArrayQueueDemo
{
    static void main()
    {
        NormalArrayQueue normalArrayQueue = new NormalArrayQueue(10);

        normalArrayQueue.enqueue(10);
        normalArrayQueue.enqueue(20);

        int result = normalArrayQueue.dequeue();
        System.out.println("res is " + result + " size is " + normalArrayQueue.getSize());

        System.out.println("peek after dequeue " + normalArrayQueue.peek());

        int result2 = normalArrayQueue.dequeue();
        System.out.println("res 2 is " + result2 + " size is " + normalArrayQueue.getSize());
        System.out.println("peek after 2 dequeue " + normalArrayQueue.peek());

        normalArrayQueue.dequeue();
    }
}
