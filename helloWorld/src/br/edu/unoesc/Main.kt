package br.edu.unoesc

import java.util.*

fun main(args: Array<String>){

    val scan = Scanner(System.`in`)
    println("Digite o Valor")
    var valor = scan.nextLine().trim().toDouble()
    println("Quantidade de Parcelas")
    var qtdpar = scan.nextLine().trim().toInt()
    println("Dias entre as Parcelas")
    var dias = scan.nextLine().trim().toLong()

    Calcular(valor,dias,qtdpar)

}