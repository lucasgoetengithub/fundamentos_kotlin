package com.fundamentos

class Pessoa(var nome : String, var idade: Int) {

    override fun toString(): String {
       return "Classe: Pessoa. Nome: ${nome}, idade: ${idade}"
    }
}

fun main() {
    var lucas = Pessoa("Lucas", 25)
    println(lucas)
}