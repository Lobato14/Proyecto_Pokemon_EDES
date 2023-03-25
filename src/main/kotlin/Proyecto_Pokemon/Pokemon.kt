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


    // Función para que el Pokemon ataque
    fun atacar(ataque: Ataque, objetivo: Pokemon) {
        println("$nombre realiza ${ataque.nombre}")
        objetivo.recibirAtaque(ataque)
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
    }

    // Función toString
    override fun toString(): String {
        return "Pokemon(nombre='$nombre', lore='$lore', tipo='$tipo', fuerza=$fuerza, vida=$vida)"
    }

    // Listas de ataques de Electricidad
    var ataquesElectrico = listOf(
        Ataque("Impactrueno", Tipo("eléctrico"), 20),
        Ataque("Cola Ferrea", Tipo("acero"), 10),
        Ataque("Rayo", Tipo("eléctrico"), 40),
        Ataque("Descarga", Tipo("eléctrico"), 25)
    )
    // Listas de ataques de Fuego
    var ataquesFuego = listOf(
        Ataque("Lanzallamas", Tipo("fuego"), 35),
        Ataque("Arañazo", Tipo("normal"), 10),
        Ataque("Ascuas", Tipo("fuego"), 25),
        Ataque("Gruñido", Tipo("normal"), 5)
    )
    // Listas de ataques de Agua
    var ataquesAgua = listOf(
        Ataque("Impactrueno", Tipo("eléctrico"), 20),
        Ataque("Cola Ferrea", Tipo("acero"), 10),
        Ataque("Rayo", Tipo("eléctrico"), 40),
        Ataque("Descarga", Tipo("eléctrico"), 25)
    )
    // Listas de ataques de Lucha
    var ataquesLucha = listOf(
        Ataque("Impactrueno", Tipo("eléctrico"), 20),
        Ataque("Cola Ferrea", Tipo("acero"), 10),
        Ataque("Rayo", Tipo("eléctrico"), 40),
        Ataque("Descarga", Tipo("eléctrico"), 25)
    )
    // Listas de ataques de Planta
    var ataquesPlanta = listOf(
        Ataque("Impactrueno", Tipo("eléctrico"), 20),
        Ataque("Cola Ferrea", Tipo("acero"), 10),
        Ataque("Rayo", Tipo("eléctrico"), 40),
        Ataque("Descarga", Tipo("eléctrico"), 25)
    )



    var ataques = mapOf("eléctrico" to ataquesElectrico, "fuego" to ataquesFuego, "agua" to ataquesAgua,
        "lucha" to ataquesLucha, "planta" to ataquesPlanta)


    fun mostrarAtaque(){

        ataques.get("elétrico")
    }


}