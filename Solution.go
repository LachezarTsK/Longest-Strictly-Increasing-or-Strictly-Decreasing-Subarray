
package main

func longestMonotonicSubarray(input []int) int {

    startIndexIncreasing := 0
    startIndexDecreasing := 0
    maxSizeMonotonicSubarray := 0

    for i := 1; i < len(input); i++ {
        if input[i] <= input[i - 1] {
            maxSizeMonotonicSubarray = max(maxSizeMonotonicSubarray, i - startIndexIncreasing)
            startIndexIncreasing = i
        }
        if input[i] >= input[i - 1] {
            maxSizeMonotonicSubarray = max(maxSizeMonotonicSubarray, i - startIndexDecreasing)
            startIndexDecreasing = i
        }
    }

    maxSizeMonotonicSubarray = max(maxSizeMonotonicSubarray, len(input) - startIndexIncreasing)
    maxSizeMonotonicSubarray = max(maxSizeMonotonicSubarray, len(input) - startIndexDecreasing)

    return maxSizeMonotonicSubarray
}
