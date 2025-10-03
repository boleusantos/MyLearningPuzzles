class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var maxSoFar = nums[0]
        var maxEndingHere = nums[0]

        for (i in 1 until nums.size) {
            maxEndingHere = maxOf(maxEndingHere + nums[i], nums[i])
            maxSoFar = maxOf(maxSoFar, maxEndingHere)
        }

        return maxSoFar
    }
}
