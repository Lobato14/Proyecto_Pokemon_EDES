package Proyecto_Pokemon

/**
 * ## Clase [Pokemon]
 *
 * Creamos una función que reciba el ataque del otro pokemon.
 *
 * @param nombre nombre del pokemon.
 * @param lore lore del pokemon
 * @param tipo tipo de pokemon.
 * @param fuerza fuerza del pokemon.
 *
 * @author Rubén Celis Lobato y Felipe Alvarado Chamorro
 *
 */
class Pokemon(nombre:String, lore:String, tipo:Tipo, fuerza:Int, vida:Int) {

    var nombre = nombre
    var lore = lore
    var tipo = tipo
    var fuerza = fuerza
        set(value) {
            if (fuerza < 0){
                println("La fuerza no puede ser menor a 0")
            }else{
                field = value
            }
        }
    var vida = vida
        set(value) {
            if (vida < 0){
                println("El daño no puede ser menor a 0")
            }else{
                field = value
            }
        }

    // Inicializamos las variables
    init {
        this.nombre = nombre
        this.lore = lore
        this.tipo = tipo
        this.fuerza = fuerza
        this.vida = vida
    }

    // Función que recibe el ataque
    fun recibirAtaque(ataque: Ataque) {
        val efectividad = tipo.comprobarEfectividad(ataque.tipo)
        val danio = when (efectividad) {
            Tipo.Efectividad.MUY_EFECTIVO -> ataque.danio * 2
            Tipo.Efectividad.POQUITO_EFECTIVO -> ataque.danio / 2
            else -> ataque.danio
        }
        vida -= danio
        println("$vida")
    }

    // Función toString
    override fun toString(): String {
        return "Pokemon(nombre='$nombre', lore='$lore', tipo='$tipo', fuerza=$fuerza, vida=$vida)"
    }


}