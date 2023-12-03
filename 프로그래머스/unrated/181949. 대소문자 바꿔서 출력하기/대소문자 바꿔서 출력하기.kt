fun main(args: Array<String>) {
    var s1 = readLine()!!
    var answer = ""
    for(index in s1.indices){
        answer += changeUpperToLower(s1[index])
    }

    println(answer)

}

fun changeUpperToLower(input: Char) : String{
    var result = ""
    if(input in 'a'..'z') {
        result = input.uppercase()
    }else if(input in 'A'..'Z'){
        result = input.lowercase()
    }
    return result
}
