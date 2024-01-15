import java.util.*
import kotlin.math.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var inputF = nextInt()
    var inputB = nextInt()
    var inputBString = inputB.toString()
    var resultArray = mutableListOf<Int>()
    var sum = 0

    for (i in inputBString.indices) {
        resultArray.add(inputF * Character.getNumericValue(inputBString[inputBString.length - 1 - i]));
    }
    resultArray.forEach { println(it) }

    for (i in inputBString.indices){
        sum += resultArray[i] * 10.0.pow(i.toDouble()).toInt()
    }
    println(sum)
}