package Proyecto_Pokemon

/**
 * ## Clase [Ataque]
 *
 * Creamos una funcion [toSring] para mostrar el nombre, el tipo y el daño del pokemon.
 *
 * @param nombre nombre del pokemon.
 * @param tipo tipo de pokemon.
 * @param danio daño que recibe el pokemon. El daño no puede ser menor a 0.
 *
 * @author Rubén Celis Lobato y Felipe Alvarado Chamorro
 *
 */
class Ataque(nombre:String, tipo:Tipo, danio:Int) {

    var nombre = nombre
    var tipo = tipo
    var danio = danio
        set(value) {
            if (danio < 0){
                println("El daño no puede ser menor a 0")
            }else{
                field = value
            }
        }
    // Inicializamos las variables
    init {
        this.nombre = nombre
        this.tipo = tipo
        this.danio = danio
    }


    // Función to String
    override fun toString(): String {
        return "Ataque(nombre='$nombre', tipo=$tipo, danio=$danio)"
    }

}