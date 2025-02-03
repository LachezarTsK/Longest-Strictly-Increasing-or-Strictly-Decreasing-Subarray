
#include <vector>
#include <algorithm>
using namespace std;

class Solution {

public:
    int longestMonotonicSubarray(const vector<int>& input) const {

        int startIndexIncreasing = 0;
        int startIndexDecreasing = 0;
        int maxSizeMonotonicSubarray = 0;

        for (int i = 1; i < input.size(); ++i) {
            if (input[i] <= input[i - 1]) {
                maxSizeMonotonicSubarray = max(maxSizeMonotonicSubarray, i - startIndexIncreasing);
                startIndexIncreasing = i;
            }
            if (input[i] >= input[i - 1]) {
                maxSizeMonotonicSubarray = max(maxSizeMonotonicSubarray, i - startIndexDecreasing);
                startIndexDecreasing = i;
            }
        }

        int size = static_cast<int>(input.size());
        maxSizeMonotonicSubarray = max(maxSizeMonotonicSubarray, size - startIndexIncreasing);
        maxSizeMonotonicSubarray = max(maxSizeMonotonicSubarray, size - startIndexDecreasing);

        return maxSizeMonotonicSubarray;
    }
};
