package com.kst.algorithms.search.linear;

import com.kst.algorithms.search.SearchAlgorithm;

public class LinearSearch implements SearchAlgorithm
{
    @Override
    public int search(int[] arr, int target)
    {
        if (arr == null || arr.length == 0)
        {
            return -1;
        }

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == target)
            {
                return i;
            }
        }

        return -1;
    }
}
