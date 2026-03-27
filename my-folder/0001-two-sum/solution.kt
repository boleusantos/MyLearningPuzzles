class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // iterate the nums array with the index
        // for each index we need to get the value for the index and (index + 1) % nums.size(). 
        // save it in a var v1 and v2
        // then sum = v1+v2
        // if sum == target then return [index, index + 1]
// index = 0, value = 3, index2 = 0, value2 = 3
// index = 0, value = 3, index2 = 1, value2 = 2, sum = 5
// index = 0, value = 3, index2 = 2, value2 = 3, sum = 6

// target 6
// x = 2
// answer = target - x

        val hash = hashMapOf<Int, Int>()
        for ((index, value) in nums.withIndex()) {
            hash.put(value, index)
        }
        for ((index, value) in nums.withIndex()) {
            val numberToFind = target - value
            val indexOfTheNumber = hash.get(numberToFind)
            if (indexOfTheNumber != null && indexOfTheNumber != index) {
                return intArrayOf(index, indexOfTheNumber)
            }
        }
        
        return intArrayOf()
    }
}
