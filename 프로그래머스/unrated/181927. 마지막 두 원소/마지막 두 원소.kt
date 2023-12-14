class Solution {
    fun solution(num_list: IntArray): IntArray {
        val lastElement = num_list[num_list.lastIndex]
        println(lastElement)
        val frontElement = num_list[num_list.lastIndex - 1]
        println(frontElement)
        var answer = intArrayOf()

        if (frontElement < lastElement)
            answer = num_list.plus(lastElement - frontElement)
        else if( frontElement >= lastElement)
            answer = num_list.plus(lastElement * 2)

        return answer
    }
}