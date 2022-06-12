package com.fundamentos

fun main(){
    dizOi(retornaNome())
    dizOi(retornaNome(), 25)
}

fun retornaNome(): String{
    return "Lucas"
}

fun dizOi(nome: String, idade: Int = 20){
    println("Oi ${nome}, parabéns pelos ${idade} anos")
}