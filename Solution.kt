
import kotlin.math.max

class Solution {

    fun longestMonotonicSubarray(input: IntArray): Int {
        
        var startIndexIncreasing = 0
        var startIndexDecreasing = 0
        var maxSizeMonotonicSubarray = 0

        for (i in 1..<input.size) {
            if (input[i] <= input[i - 1]) {
                maxSizeMonotonicSubarray = max(maxSizeMonotonicSubarray, i - startIndexIncreasing)
                startIndexIncreasing = i
            }
            if (input[i] >= input[i - 1]) {
                maxSizeMonotonicSubarray = max(maxSizeMonotonicSubarray, i - startIndexDecreasing)
                startIndexDecreasing = i
            }
        }

        maxSizeMonotonicSubarray = max(maxSizeMonotonicSubarray, input.size - startIndexIncreasing)
        maxSizeMonotonicSubarray = max(maxSizeMonotonicSubarray, input.size - startIndexDecreasing)

        return maxSizeMonotonicSubarray
    }
}
