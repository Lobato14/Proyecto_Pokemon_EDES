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
    fun recibirAtaque(ataque: Ataque) {
        var factor = if (ataque.tipo.tipo == tipo.tipo){
            0.5
        } else{
            1.0
        }
        var danio = (ataque.danio * factor).toInt()
        vida -= danio
    }

    fun tipoDebil(tipoAtaque: Tipo): String {
        return if (tipo.esDebilContra(tipoAtaque.tipo)) {
            tipoAtaque.tipo
        } else {
            "Este pokemon no es débil ante el otro"
        }
    }
    override fun toString(): String {
        return "Pokemon(nombre='$nombre', lore='$lore', tipo='$tipo', fuerza=$fuerza, vida=$vida)"
    }


}