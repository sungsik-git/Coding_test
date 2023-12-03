fun main(args: Array<String>) {
    val a = readLine()!!.toInt().let { if(it % 2 == 0) println("$it is even") else println("$it is odd") }
}