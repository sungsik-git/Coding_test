class Solution {
    fun solution(num_list: IntArray): Int {
        var even_number = num_list.filter { it % 2 == 0 }.joinToString("").toInt()
        var odd_number = num_list.filter { it % 2 == 1 }.joinToString("").toInt()

        return even_number + odd_number
    }
}