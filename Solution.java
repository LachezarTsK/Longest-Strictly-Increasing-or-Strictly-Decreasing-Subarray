
public class Solution {

    public int longestMonotonicSubarray(int[] input) {

        int startIndexIncreasing = 0;
        int startIndexDecreasing = 0;
        int maxSizeMonotonicSubarray = 0;

        for (int i = 1; i < input.length; ++i) {
            if (input[i] <= input[i - 1]) {
                maxSizeMonotonicSubarray = Math.max(maxSizeMonotonicSubarray, i - startIndexIncreasing);
                startIndexIncreasing = i;
            }
            if (input[i] >= input[i - 1]) {
                maxSizeMonotonicSubarray = Math.max(maxSizeMonotonicSubarray, i - startIndexDecreasing);
                startIndexDecreasing = i;
            }
        }

        maxSizeMonotonicSubarray = Math.max(maxSizeMonotonicSubarray, input.length - startIndexIncreasing);
        maxSizeMonotonicSubarray = Math.max(maxSizeMonotonicSubarray, input.length - startIndexDecreasing);

        return maxSizeMonotonicSubarray;
    }
}
