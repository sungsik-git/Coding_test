class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        val removeCount = my_string.length - n
        answer = my_string.removeRange(0, removeCount)
        return answer
    }
}