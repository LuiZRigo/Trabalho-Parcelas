package br.edu.unoesc

class Superficie(val altura: Double, val largura: Double) {

    fun getArea(): Double {
        return altura*largura
    }
}