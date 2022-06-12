package com.fundamentos

class Carro(var cor: String, var anoDeFabricacao: Int, val dono: Dono) {

}

data class Dono(var nome: String, var idade: Int) {

}

fun main(){
    var carro = Carro("Branco", 2021, Dono("Lucas", 25))
    println(carro.cor);

    println(carro.dono.idade)


}