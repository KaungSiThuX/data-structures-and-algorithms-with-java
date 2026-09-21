package com.kst.data_structures.linear.linked_list;

public abstract class LinkedList
{
    Node head;
    Node tail;
    int size;
//
//    protected LinkedList(Node head, Node tail, int size)
//    {
//        this.head = head;
//        this.tail = tail;
//        this.size = size;
//    }

    protected abstract void addFirst(int element);

    protected abstract void addLast(int element);

    protected abstract Node removeFirst();

    protected abstract Node removeLast();

    protected abstract int get(int index);

    protected abstract void remove(int element);

    protected abstract boolean contains(int element);

    protected abstract boolean isEmpty();
}
