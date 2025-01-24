package com.matheus.kt

fun acelerar(){
    println("acelerar")
}

class Jogador {

    var kart = ""
    var pneu = ""
    var planador = ""

    fun acelerar( aceleracao: Int = 0 ){
        println("acelerar na velocidade $aceleracao")
    }

//    fun retornarPoder() : String {
//        return "Casco vermelho"
//    }

    fun retornarPoder() : String = "Casco vermelho"


}

fun main() {

    val jogador = Jogador()
    jogador.kart = "Kart do Mario"
    jogador.acelerar()
    println(jogador.retornarPoder())
   // println(jogador.kart)

}