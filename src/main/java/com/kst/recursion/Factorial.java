package com.kst.recursion;

public class Factorial
{
    static int compute(int number)
    {
        if (number == 0)
        {
            return 1;
        }
        else
        {
            return number * compute(number - 1);
        }
    }

    static void main()
    {
        int result = compute(5);

        System.out.println("result is " + result);
    }
}
