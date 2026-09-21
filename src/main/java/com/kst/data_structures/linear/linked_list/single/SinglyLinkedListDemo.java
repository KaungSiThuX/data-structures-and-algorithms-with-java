package com.kst.data_structures.linear.linked_list.single;

import com.kst.data_structures.linear.linked_list.Node;

public class SinglyLinkedListDemo
{
    static void main()
    {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.addFirst(20);
        singlyLinkedList.addFirst(30);
        singlyLinkedList.addFirst(40);
        singlyLinkedList.addLast(80);
        singlyLinkedList.addLast(-20);

//        System.out.println("current size is " + singlyLinkedList.size);
//
//        Node node = singlyLinkedList.removeFirst();
//
//        System.out.println("node is " + node);
//
//        System.out.println("size after remove is " + singlyLinkedList.size);
        //  singlyLinkedList.traverse();

        //   Node removedNode = singlyLinkedList.removeLast();
        //  System.out.println("removed node is " + removedNode);

        //  System.out.println(".......................");

        // boolean result = singlyLinkedList.contains(80);

        // System.out.println("result is " + result);

        //    singlyLinkedList.traverse();

        int result = singlyLinkedList.get(4);

        System.out.println("result is " + result);
    }
}
