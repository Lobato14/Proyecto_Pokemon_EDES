package Proyecto_Pokemon

/**
 * ## Clase [Ataque]
 *
 * @param nombre nombre del pokemon
 * @param tipo tipo de pokemon
 * @param danio daño que recibe el pokemon
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
    init {
        this.nombre = nombre
        this.tipo = tipo
        this.danio = danio
    }
    override fun toString(): String {
        return "Ataque(nombre='$nombre', tipo=$tipo, danio=$danio)"
    }

}