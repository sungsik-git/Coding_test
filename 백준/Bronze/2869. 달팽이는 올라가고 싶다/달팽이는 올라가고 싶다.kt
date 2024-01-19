import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val A = nextInt()
    val B = nextInt()
    val V = nextInt()

    var day = (V - B) / (A - B)

    if((V - B) % (A - B) != 0){
        day++
    }
    println(day)
}
