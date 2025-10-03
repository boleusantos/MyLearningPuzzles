class Solution {

    fun containsDuplicate(nums: IntArray): Boolean {
        val hashNums = hashSetOf<Int>()
        for (n in nums) {
            if (!hashNums.add(n)) return true
        }

        return false
    }
}
