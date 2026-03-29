class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
         // Sort nums
        // Group and count
        // filter by k

         // Sort nums
        // Group and count
        // filter by k

        val sortedNums = nums.sorted()
        val numsCount = hashMapOf<Int, Int>()
        for (n in sortedNums) {
            if (!numsCount.contains(n)) {
                numsCount[n] = 1
            } else {
                numsCount[n] = numsCount[n]?.plus(1)!!
            }
        }
        val sortedNumsCount = numsCount.toList().sortedByDescending { (_, value) -> value }.toMap()
        var i = 0
        val mostFrequentList = mutableListOf<Int>()
        for (n in sortedNumsCount.iterator()) {
            mostFrequentList.add(n.key)
            i++
            if (i == k) {
                break;
            }
        }

        return mostFrequentList.toIntArray()
    }
}
