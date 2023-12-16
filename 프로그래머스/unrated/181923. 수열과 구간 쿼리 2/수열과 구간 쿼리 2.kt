class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        val answer = mutableListOf<Int>()

        for (query in queries) {
            val s = query[0]
            val e = query[1]
            val k = query[2]

            var num_max = Int.MAX_VALUE

            for (index in s..e) {
                if (arr[index] > k && arr[index] < num_max) {
                    num_max = arr[index]
                }
            }

            if (num_max == Int.MAX_VALUE) {
                answer.add(-1)
            } else {
                answer.add(num_max)
            }
        }

        return answer.toIntArray()
    }
}