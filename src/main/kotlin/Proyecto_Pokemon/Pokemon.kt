package Proyecto_Pokemon

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

    init {
        this.nombre = nombre
        this.lore = lore
        this.tipo = tipo
        this.fuerza = fuerza
        this.vida = vida
    }

    // Recibe el ataque
    fun recibirAtaque(ataque: Ataque) {
        val efectividad = tipo.comprobarEfectividad(ataque.tipo)
        val danio = when (efectividad) {
            Tipo.Efectividad.MUY_EFECTIVO -> ataque.danio * 2
            Tipo.Efectividad.POQUITO_EFECTIVO -> ataque.danio / 2
            else -> ataque.danio
        }
        vida -= danio
    }
    override fun toString(): String {
        return "Pokemon(nombre='$nombre', lore='$lore', tipo='$tipo', fuerza=$fuerza, vida=$vida)"
    }


}