package br.edu.unoesc

import java.time.LocalDate

fun Calcular(valor: Double, dias: Long, qtdpar: Int) {
    var data = LocalDate.now()
    for (i in 1..qtdpar) {
        println("")
        println("" + i + "/" + qtdpar)
        println(" " + Math.round((valor/ qtdpar) * 100.0) / 100.0)
        println("" + data)
        data = data.plusDays(dias)
    }

}

