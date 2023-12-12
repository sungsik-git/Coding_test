class Solution {
    fun solution(a: Int, b: Int): Int {
        return "$a$b".toInt().coerceAtLeast(2 * a * b)
    }
}