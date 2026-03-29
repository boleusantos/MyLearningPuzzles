class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
/*
            - I should iterate each string and check the other strings if it's a anagram.
            - Every word starts in a group. This group could be a hash<String, list>
         */
val groups = hashMapOf<String, ArrayList<String>>()
        for (value in strs) {
            val sortedValue = value.toList().sorted().toString()
            if (groups.contains(sortedValue)) {
                groups[sortedValue]?.add(value)
            } else {
                groups[sortedValue] = arrayListOf(value)
            }
        }
        val listGroups = arrayListOf<List<String>>()
        for (l in groups.iterator()) {
            listGroups.add(l.value)
        }
        return listGroups
    }
}
