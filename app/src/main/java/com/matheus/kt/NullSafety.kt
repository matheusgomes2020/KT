package com.matheus.kt

class Carro {

    var cor = "Vermelho"

    fun acelerar() {

    }

}

fun main() {

    var carro: Carro? = null
    carro = carro()

    val cor = carro?.cor ?: "cor padrão"

        println( cor )

}