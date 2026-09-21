package com.kst.data_structures.linear.array;

public class NormalArray
{
    int[] arr;

    public NormalArray(int[] arr)
    {
        if (arr.length == 0)
        {
            throw new RuntimeException("invalid size");
        }

        this.arr = arr;
    }

    int[] insertAtBeginning(int number)
    {
        int[] newArr = new int[arr.length + 1];

        newArr[0] = number;

        for (int i = 0; i < arr.length; i++)
        {
            newArr[i + 1] = arr[i];
        }

        arr = newArr;

        return arr;
    }

    int[] insertAtIndex(int index, int number)
    {
        if (index > this.arr.length || index < 0)
        {
            throw new RuntimeException("invalid index");
        }

        int[] newArr = new int[this.arr.length + 1];

        for (int i = 0; i < newArr.length; i++)
        {
            if (i == index)
            {
                newArr[i] = number;
            }
            else if (i < index)
            {
                newArr[i] = arr[i];
            }
            else
            {
                newArr[i] = arr[i - 1];
            }
        }

        arr = newArr;

        return arr;
    }

    int[] insertAtEnd(int number)
    {
        if (this.isEmpty())
        {
            arr[0] = number;
        }
        else
        {
            arr[arr.length] = number;
        }

        return this.arr;
    }

    int getByIndex(int index)
    {
        if (index < 0 || index >= arr.length)
        {
            throw new RuntimeException("invalid index");
        }

        return arr[index];
    }

    int size()
    {
        return this.arr.length;
    }

    boolean isEmpty()
    {
        return this.arr.length == 0;
    }
}
