import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    while(true){
        var (a, b) = nextLine().split(" ").map { it.toInt() }
        if( a == 0) break

        println(
            disting(a, b)
        )
    }
}
fun disting(a: Int, b: Int): String{
    return if( a > b){
        if(a % b == 0) "multiple"
        else "neither"
    }else{
        if(b % a == 0) "factor"
        else "neither"
    }
}