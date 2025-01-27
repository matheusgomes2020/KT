package com.matheus.kt

//Construtor primário
class Usuario (
    var nome: String = "",
    var sobrenome: String = ""
) {


    init { //Inicializar
        this.nome = nome
        this.sobrenome = sobrenome
        println("Objeto inicializado")
        println("nome: $nome sobrenome: $sobrenome")
    }

    //Construtor secundário
    constructor(nome: String) : this(nome, "") {
        println("Construtor secundário")
    }

}

fun main(){
    val usuario = Usuario("Matheus", )

}