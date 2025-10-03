class Solution {
    fun firstUniqChar(s: String): Int {
        val hashMap = hashMapOf<Char, Boolean>()
        for (i in s.withIndex()) {
            if (hashMap.contains(i.value)) {
                hashMap.put(i.value, true)
            } else {
                hashMap.put(i.value, false)
            }
        }
        for (i in s.withIndex()) { 
            if (!hashMap.get(i.value)!!) {
                return i.index
            }
        }
        return -1
    }
}
