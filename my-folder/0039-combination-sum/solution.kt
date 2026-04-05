class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        // [2,3,6,7] 7
        // (1) result = target - candidates[index]
        // (2) result < repeat 1.
        val result = mutableListOf<List<Int>>()
        val current = mutableListOf<Int>()
        val sortedCandidates = candidates.sorted()

        fun backtrack(startIndex: Int, remaining: Int) {
            if (remaining == 0) {
                result.add(current.toList())
                return
            }

            if (remaining < 0) {
                return
            }

            for (i in startIndex until sortedCandidates.size) {
                val candidate = sortedCandidates[i]

                current.add(candidate)                 // choose
                backtrack(i, remaining - candidate)    // explore
                current.removeAt(current.size - 1)     // undo
            }
        }

        backtrack(0, target)
        return result
    }
    
}
