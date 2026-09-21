package com.kst.algorithms.search.binary;

public class BinarySearchDemo
{
    static void main()
    {
        int[] arr = {10, 20, 30, 40, 50};

        BinarySearch binarySearch = new BinarySearch();

        int index = binarySearch.search(arr, 30);

        System.out.println("index is " + index);
    }
}
