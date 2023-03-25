package Proyecto_Pokemon

class Tipo(tipo:String) {

    var tipo = tipo
    init {
        this.tipo = tipo
    }

    var debilidades = mapOf(
        "Agua" to listOf("Electrico"),
        "Fuego" to listOf("Agua"),
        "Hierba" to listOf("Fuego"),
        "Electrico" to listOf("Tierra"),
        "Hielo" to listOf("Fuego")
    )

    fun esDebilContra(tipoAtaque: String): Boolean {
        return tipoAtaque in (debilidades[tipo] ?: emptyList())
    }

}