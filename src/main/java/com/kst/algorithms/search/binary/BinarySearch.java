package com.kst.algorithms.search.binary;

import com.kst.algorithms.search.SearchAlgorithm;

public class BinarySearch implements SearchAlgorithm
{
    @Override
    public int search(int[] arr, int target)
    {
        if (arr == null || arr.length == 0)
        {
            return -1;
        }

        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex <= endIndex)
        {
            int middleIndex = (startIndex + endIndex) / 2;

            if (arr[middleIndex] == target)
            {
                return middleIndex;
            }
            else if (arr[middleIndex] > target)
            {
                endIndex = middleIndex - 1;
            }
            else
            {
                startIndex = middleIndex + 1;
            }
        }

        return -1;
    }
}
