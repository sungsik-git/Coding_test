fun main() {
    val caseCnt = readln().toInt()

    val quarter = 25
    val dime = 10
    val nickel = 5
    val penny = 1



    for (i in 0 until caseCnt){
        var input = readln().toInt()

        var quarterCnt = 0
        var dimeCnt = 0
        var nickelCnt = 0
        var pennyCnt = 0

        quarterCnt = input / quarter
        input %= quarter

        dimeCnt = input / dime
        input %= dime

        nickelCnt = input / nickel
        input %= nickel

        pennyCnt = input / penny
        input %= penny

        println("$quarterCnt $dimeCnt $nickelCnt $pennyCnt")
    }
}