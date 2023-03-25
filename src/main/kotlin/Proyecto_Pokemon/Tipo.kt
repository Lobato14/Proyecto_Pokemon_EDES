package Proyecto_Pokemon

/**
 * ## Clase [Tipo]
 *
 * La clase [Tipo] se utiliza para asignar un Tipo a un pokemon para saber si es neutro,
 * resistente o débil realizando un ataque o recibiéndolo.
 *
 * La enum class [Efectividad] sirve para medir el tipo de efectividad que tiene un ataque.
 *
 * La función [comprobarEfectividad] sirve para que lo que su nombre se refiere,
 * comprueba lo efectivo que es un ataque.
 *
 * @param tipo String el cual se le asigna una Cadena la cual luego será comparada con las disponibles.
 *
 * @author Rubén Celis Lobato y Felipe Alvarado Chamorro
 *
 */

class Tipo(tipo:String) {

    var tipo = tipo
    init {
        this.tipo = tipo
    }

    // Tipo de efectividad
    enum class Efectividad {
        NORMAL,
        MUY_EFECTIVO,
        POQUITO_EFECTIVO
    }
    // Funcion que comprueba la efectividad
    fun comprobarEfectividad(tipoAtaque: Tipo): Efectividad {
        return when (tipo) {
            "fuego" -> when (tipoAtaque.tipo) {
                "hierba" -> Efectividad.MUY_EFECTIVO
                "agua" -> Efectividad.POQUITO_EFECTIVO
                else -> Efectividad.NORMAL
            }
            "agua" -> when (tipoAtaque.tipo) {
                "fuego" -> Efectividad.MUY_EFECTIVO
                "hierba" -> Efectividad.POQUITO_EFECTIVO
                else -> Efectividad.NORMAL
            }
            "hierba" -> when (tipoAtaque.tipo) {
                "agua" -> Efectividad.MUY_EFECTIVO
                "fuego" -> Efectividad.POQUITO_EFECTIVO
                else -> Efectividad.NORMAL
            }
            "normal" -> Efectividad.NORMAL
            "eléctrico" -> when (tipoAtaque.tipo) {
                "agua" -> Efectividad.MUY_EFECTIVO
                "hierba" -> Efectividad.POQUITO_EFECTIVO
                "normal" -> Efectividad.POQUITO_EFECTIVO
                else -> Efectividad.NORMAL
            }
            "lucha" -> when (tipoAtaque.tipo) {
                "normal" -> Efectividad.MUY_EFECTIVO
                "hierba" -> Efectividad.POQUITO_EFECTIVO
                else -> Efectividad.NORMAL
            }
            else -> Efectividad.NORMAL
        }
    }

    override fun toString(): String {
        return "$tipo"
    }
}