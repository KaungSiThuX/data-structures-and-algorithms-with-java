package com.kst.data_structures.linear.linked_list.single;

import com.kst.data_structures.linear.linked_list.Node;

public class SinglyNode extends Node
{
    @Override
    public String toString()
    {
        return "SinglyNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    int data;
    SinglyNode next;

    public SinglyNode(int data)
    {
        this.data = data;
        this.next = null;
    }

    public int getData()
    {
        return data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    public SinglyNode getNext()
    {
        return next;
    }

    public void setNext(SinglyNode next)
    {
        this.next = next;
    }
}
