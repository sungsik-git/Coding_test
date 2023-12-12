class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        when(n % 2){
            1 -> for (i in 0..n)
            {
                if(i % 2 == 1) answer += i
            }
            0 -> for (i in 0..n)
            {
                if(i % 2 == 0) answer += ( i * i )
            }
        }
    return answer
    }
}