package com.fundamentos

fun main(){
    var lista = mutableListOf(1,2,3,4,5,6)
    val pares = lista.filter {it %2 == 0}.first()

    println(pares)
    lista.forEach{
    //    println(it)
    }

    lista.add(7)
    lista.forEach{
    //    println(it)
    }


    var sets = setOf(1,2,3,2)
    println(sets)
}