import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var input = next() //level
    var divideInput = input.split("") //l e v e l
    var flag = false

    for( i in 1..input.length/2){
        if(divideInput[i] != divideInput[input.length-i+1]) flag = true
    }

    if(flag) print("0") else print("1")
}