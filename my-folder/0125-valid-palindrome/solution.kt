class Solution {
    fun isPalindrome(s: String): Boolean {
        val cleanText = s.trim().lowercase().filter {it.isLetterOrDigit()}

        val reversedText = cleanText.reversed()
        return cleanText == reversedText

    }
}
