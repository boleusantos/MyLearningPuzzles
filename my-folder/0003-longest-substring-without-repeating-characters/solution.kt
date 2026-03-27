class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        // iterate the string
        // check if the current index is equal to the next one, if so, we could append in a new string, if not, break the for

// 
        var longestSubstring = ""

        for ((index, value) in s.withIndex()) {
            var currentSubstring = ""
            for (index2 in index until s.length) {
                if (!currentSubstring.contains(s[index2])) {
                    currentSubstring += s[index2]
                } else {
                    break;
                }
            }
            if (currentSubstring.length > longestSubstring.length) {
                longestSubstring = currentSubstring
            }
            currentSubstring = ""
        }
        return longestSubstring.length
    }
}
