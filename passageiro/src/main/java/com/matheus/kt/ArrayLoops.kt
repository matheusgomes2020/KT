package com.matheus.kt

fun main () {

    /*
    val nomes = arrayOf(
        "Maria",
        "João",
        "José",
        "Pedro"

    )

    nomes[0] = "mudou"

    println(nomes[0])

     */

//    var numero = 1
//    while (numero <= 5) {
//        println( "Executou: $numero" )
//        numero++
//    }

//    for (numero in 1..5) {
//        println( "Executou: $numero" )
//
//    }

    val postagens = arrayOf(
        "Viagem para a praia",
        "Levei meu cachorro no veterinário",
        "Trilha com os amigos"
    )

    for ((indice, postagem) in postagens.withIndex()) {
        println("$indice $postagem")
    }

}