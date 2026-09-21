package com.kst.data_structures.linear.array;

public class ArrayDemo
{
    static void main()
    {
        int[] arr = {10, 20, 30, 40, 50};

        NormalArray normalArray = new NormalArray(arr);

        normalArray.insertAtIndex(3, 100);

        int[] newArr = normalArray.insertAtEnd(300);

        for (int num : newArr)
        {
            System.out.println("num is " + num);
        }
    }
}
