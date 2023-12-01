class Solution {
    fun solution(num_list: IntArray, n: Int): Int {
        
        return if(num_list.any { it == n  } ) 1 else 0
    }
}