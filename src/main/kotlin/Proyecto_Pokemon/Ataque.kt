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

    var ataques = mapOf("eléctrico" to ataquesElectrico, "fuego" to ataquesFuego, "agua" to ataquesAgua, "lucha" to ataquesLucha, "hierba" to ataquesPlanta)
    // Función to String
    override fun toString(): String {
        return "Ataque(nombre='$nombre', tipo=$tipo, danio=$danio)"
    }

}