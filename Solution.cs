
using System;

public class Solution
{
    public int LongestMonotonicSubarray(int[] input)
    {
        int startIndexIncreasing = 0;
        int startIndexDecreasing = 0;
        int maxSizeMonotonicSubarray = 0;

        for (int i = 1; i < input.Length; ++i)
        {
            if (input[i] <= input[i - 1])
            {
                maxSizeMonotonicSubarray = Math.Max(maxSizeMonotonicSubarray, i - startIndexIncreasing);
                startIndexIncreasing = i;
            }
            if (input[i] >= input[i - 1])
            {
                maxSizeMonotonicSubarray = Math.Max(maxSizeMonotonicSubarray, i - startIndexDecreasing);
                startIndexDecreasing = i;
            }
        }

        maxSizeMonotonicSubarray = Math.Max(maxSizeMonotonicSubarray, input.Length - startIndexIncreasing);
        maxSizeMonotonicSubarray = Math.Max(maxSizeMonotonicSubarray, input.Length - startIndexDecreasing);

        return maxSizeMonotonicSubarray;
    }
}
