import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var (a, b) = nextLine().split(" ").map{ it.toInt() }
    var factor = mutableListOf<Int>()
    for( i in 1 .. a){
        if(a % i == 0) factor.add(i)
    }
    if(factor.size < b) println("0")
    else println(factor[b-1])
}
