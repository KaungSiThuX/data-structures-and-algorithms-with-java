package com.kst.data_structures.linear.linked_list.single;

import com.kst.data_structures.linear.linked_list.LinkedList;
import com.kst.data_structures.linear.linked_list.Node;

public class SinglyLinkedList extends LinkedList
{
    SinglyNode head;
    SinglyNode tail;
    int size;

    public SinglyLinkedList()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    @Override
    public void addFirst(int element)
    {
        SinglyNode newNode = new SinglyNode(element);

        if (this.isEmpty())
        {
            this.head = newNode;
            this.tail = newNode;
        }
        else
        {
            newNode.next = this.head;
            this.head = newNode;
        }

        size++;
    }

    @Override
    public void addLast(int element)
    {
        SinglyNode newNode = new SinglyNode(element);

        if (this.isEmpty())
        {
            this.head = newNode;
            this.tail = newNode;
        }
        else
        {
            this.tail.next = newNode;
            this.tail = newNode;
        }

        size++;
    }

    @Override
    public Node removeFirst()
    {
        if (this.isEmpty())
        {
            throw new RuntimeException("linked list is empty");
        }

        SinglyNode removedNode;

        if (this.size == 1)
        {
            removedNode = head;
            head = null;
            tail = null;
        }
        else
        {
            removedNode = this.head;
            this.head = this.head.next;
        }

        size--;

        return removedNode;
    }

    @Override
    public Node removeLast()
    {
        if (this.isEmpty())
        {
            throw new RuntimeException("linked list is empty");
        }

        SinglyNode removedNode;

        if (size == 1)
        {
            removedNode = tail;
            head = null;
            tail = null;
        }
        else
        {
            SinglyNode current = head;

            while (current.next.next != null)
            {
                current = current.next;
            }

            removedNode = current.next;

            this.tail = current;
            this.tail.next = null;
        }

        size--;

        return removedNode;
    }

    @Override
    public int get(int index)
    {
        if (this.isEmpty())
        {
            throw new RuntimeException("linked list empty");
        }

        if (index < 0 || index >= size)
        {
            throw new RuntimeException("invalid index");
        }

        SinglyNode current = this.head;
        int count = 0;

        while (current != null)
        {
            if (count == index)
            {
                return current.data;
            }
            current = current.next;
            count++;
        }

        throw new RuntimeException("element not found");
    }

    @Override
    public void remove(int element)
    {
        if (this.isEmpty())
        {
            throw new RuntimeException("linked list is empty");
        }

        if (head.data == element)
        {
            this.removeFirst();
        }

        SinglyNode previous = null;
        SinglyNode current = head;

        while (current != null && current.data != element)
        {
            previous = current;
            current = current.next;
        }

        size--;
    }

    @Override
    public boolean contains(int element)
    {
        if (this.isEmpty())
        {
            throw new RuntimeException("linked list is empty");
        }

        SinglyNode current = head;

        while (current != null)
        {
            if (current.data == element)
            {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    @Override
    protected boolean isEmpty()
    {
        return this.head == null;
    }

    void traverse()
    {
        if (!this.isEmpty())
        {
            SinglyNode current = this.head;

            while (current != null)
            {
                System.out.println("current is " + current);
                current = current.next;
            }
        }
        else
        {
            System.out.println("linked list is empty");
        }
    }
}
