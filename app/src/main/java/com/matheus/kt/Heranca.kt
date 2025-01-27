package com.matheus.kt

open class Animal {

    var cor = "Amarelo"
    var tamanho = ""
    var peso = 0.0

    open fun correr() = println("Correr como um ")
    open fun dormir() = println("dotmir")

}

class Cao : Animal() {
    fun latir() = println("latir")
    override fun correr() {
        super.correr()
        println("cão de 4 patas")
    }

}

class Passaro : Animal() {
    fun voar() = println("voar")
    override fun correr() {
        super.correr()
        println("pássaro de 2 perninhas")
    }
}

fun main (){

    val cao = Cao()
    cao.correr()
    //cao.latir()

    val passaro = Passaro()
    passaro.correr()
    //passaro.voar()
}