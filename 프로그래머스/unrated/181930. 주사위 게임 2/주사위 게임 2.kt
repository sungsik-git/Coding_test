class Solution {
    fun solution(a: Int, b: Int, c: Int): Int = if (a != b && a != c && b != c) {
        a + b + c
    }else if ( a == b && a == c){
        (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c)
    }else{
        (a + b + c) * (a * a + b * b + c * c)
    }
}