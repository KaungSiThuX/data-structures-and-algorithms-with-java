package com.kst.algorithms.search.linear;

public class LinearSearchDemo
{
    static void main()
    {
        int[] arr = {10, 3, 5, 20, 39};

        LinearSearch linearSearch = new LinearSearch();

        int index = linearSearch.search(arr, 5);

        System.out.println("index is " + index);
    }
}
