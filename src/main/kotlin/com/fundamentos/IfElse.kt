package com.fundamentos

fun main(){
  println(parOuImpar(2))
}

fun parOuImpar(numero: Int): String {
    return if (numero%2 == 0 ) {
        "Par"
    } else {
        "Ímpar"
    }
}