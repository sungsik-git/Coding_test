package com.chatting.myapplication

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var input = nextInt()

    for( i in 1..input){
        for( j in 1..input-i){
            print(" ");
        }
        for( k in 1..<i*2) {
            print("*")
        }
        println()
    }

    for( i in 1..<input){
        for(j in 1..i){
            print(" ");
        }
        for(k in 1..<input*2-i*2){
            print("*")
        }
        println()
    }
}
