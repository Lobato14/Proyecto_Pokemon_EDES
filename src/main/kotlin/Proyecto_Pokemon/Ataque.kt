package Proyecto_Pokemon

class Ataque(nombre:String, tipo:String, danio:Int): Pokemon(nombre, "", tipo, 0, 0) {

    var danio = danio
        set(value) {
            if (danio < 0){
                println("El daño no puede ser menor a 0")
            }else{
                field = value
            }
        }

    override fun toString(): String {
        return "Ataque(nombre='$nombre', tipo=$tipo, danio=$danio)"
    }

}