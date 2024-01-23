import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    while (true) {
        val n = nextInt()
        val dividerArr = mutableListOf<Int>()
        var sum = 0

        if (n == -1) break

        for (i in 1 until n) {
            if (n % i == 0) {
                dividerArr.add(i)
            }
        }

        for (i in 0 until dividerArr.size) {
            sum += dividerArr[i]
        }

        if (sum == n) {
            print("$n = ")
            for (i in 0 until dividerArr.size - 1) {
                print("${dividerArr[i]} + ")
            }
            println(dividerArr.last())
        } else {
            println("$n is NOT perfect.")
        }
    }
}