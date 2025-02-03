
function longestMonotonicSubarray(input: number[]): number {

    let startIndexIncreasing = 0;
    let startIndexDecreasing = 0;
    let maxSizeMonotonicSubarray = 0;

    for (let i = 1; i < input.length; ++i) {
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
};
