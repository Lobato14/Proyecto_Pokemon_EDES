package Proyecto_Pokemon

abstract class Pokemon(nombre:String, lore:String, tipo:String, fuerza:Int, vida:Int) {

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

    init {
        this.nombre = nombre
        this.lore = lore
        this.tipo = tipo
        this.fuerza = fuerza
        this.vida = vida
    }

    override fun toString(): String {
        return "Pokemon(nombre='$nombre', lore='$lore', tipo='$tipo', fuerza=$fuerza, vida=$vida)"
    }


}