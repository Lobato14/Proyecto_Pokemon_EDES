package Proyecto_Pokemon

fun main(){

    // Creacion de los pokemon
    var pikachu = Pokemon("Pikachu", "Ratón eléctrico", Tipo("eléctrico"), 100, 80)
    var charmander = Pokemon("Charmander", "Lagarto de fuego", Tipo("fuego"), 90, 75)
    var bulbasur = Pokemon("Bulbasur", "Bicho Planta", Tipo("planta"), 50, 110)
    var machamp = Pokemon("Machamp", "Luchador", Tipo("lucha"), 70, 90)
    var squirtle = Pokemon("Squirtle", "Tortuga de Agua", Tipo("agua"), 30, 80)

    // Lista de los pokemon a elegir
    var listaPokemon = listOf<Pokemon>(pikachu,charmander,bulbasur,machamp,squirtle)

    // Listas de ataques de Electricidad
    var ataquesElectrico = listOf(
        Ataque("Impactrueno", Tipo("eléctrico"), 20),
        Ataque("Parálisis", Tipo("eléctrico"), 10),
        Ataque("Rayo", Tipo("eléctrico"), 40),
        Ataque("Descarga", Tipo("eléctrico"), 25)
    )
    // Listas de ataques de Fuego
    var ataquesFuego = listOf(
        Ataque("Lanzallamas", Tipo("fuego"), 40),
        Ataque("Estallido", Tipo("fuego"), 10),
        Ataque("Ascuas", Tipo("fuego"), 25),
        Ataque("Colmillo ígneo", Tipo("fuego"), 5)
    )
    // Listas de ataques de Agua
    var ataquesAgua = listOf(
        Ataque("Agua lodosa", Tipo("agua"), 20),
        Ataque("Danza lluvia", Tipo("agua"), 0),
        Ataque("Hidrobomba", Tipo("agua"), 45),
        Ataque("Surf", Tipo("agua"), 35)
    )
    // Listas de ataques de Lucha
    var ataquesLucha = listOf(
        Ataque("Doble patada", Tipo("lucha"), 12+15),
        Ataque("Onda certera", Tipo("lucha"), 30),
        Ataque("Palmeo", Tipo("lucha"), 25),
        Ataque("Ultrapuño", Tipo("lucha"), 30)
    )
    // Listas de ataques de Planta
    var ataquesPlanta = listOf(
        Ataque("Látigo Cepa", Tipo("planta"), 15),
        Ataque("Drenadoras", Tipo("planta"), 5),
        Ataque("Energibola", Tipo("planta"), 35),
        Ataque("Rayo solar", Tipo("planta"), 35)
    )

    // Mapa de los tipos de ataque según el pokemon
    var ataques = mapOf(
        "eléctrico" to ataquesElectrico,
        "fuego" to ataquesFuego,
        "agua" to ataquesAgua,
        "lucha" to ataquesLucha,
        "planta" to ataquesPlanta
    )
    // Fución que muestra la lista de los pokemon
    fun mostrarlistaPokemon(){
        for(pokemon in listaPokemon){
            println("${pokemon.nombre} | Lore: ${pokemon.lore} | Tipo: ${pokemon.tipo} | Fuerza: ${pokemon.fuerza} | Vida: ${pokemon.vida}")
        }
    }

    // Creación de los jugadores que almacenan los pokemon

    var jugador1 = mutableListOf<Pokemon>()
    var jugador2 = mutableListOf<Pokemon>()

    // Elección del pokemon
    println("---Elige un Pokemon Jugador 1 del 1 al 5------")
    mostrarlistaPokemon()
    println("-------------------------")
    var elegirPokemon1 = readLine()?.toInt()?.minus(1) ?: 0
    jugador1.add(listaPokemon[elegirPokemon1])
    var tipo1 = jugador1[0].tipo.toString()
    var lista1 = ataques.getOrDefault(tipo1, emptyList())

    println("---Elige un Pokemon Jugador 2 del 1 al 5------")
    mostrarlistaPokemon()
    println("-------------------------")
    var elegirPokemon2 = readLine()?.toInt()?.minus(1) ?: 0
    jugador2.add(listaPokemon[elegirPokemon2])
    var tipo2 = jugador2[0].tipo.toString()
    var lista2 = ataques.getOrDefault(tipo2, emptyList())

    // Mostrar los Pokemon que se enfrentarán
    println("------------------------------------")
    println("---¡COMIENZA LA BATALLA POKEMON!----")
    println("------${jugador1[0].nombre} VS ${jugador2[0].nombre}------")
    println("------------------------------------")

    // Turno del primer Pokemon
    var turno = 0
    while (jugador1.size > 0 && jugador2.size > 0) {
        // Contador para los tunos
        turno += 1
        // Mostrar el turno actual
        println("Turno $turno:")
        println("")
        // Elegir el ataque del primer Pokemon
        println(
            "Es el turno de ${jugador1[0].nombre}.                  Vida Total:${jugador1[0].vida}" +
                    "\nElige un ataque:"
        )
        println("---------")
        lista1.forEachIndexed { index, ataque -> println("${index+1}. $ataque") }
        println("---------")
        var ataqueAelegirJug1 = readLine()?.toInt()?.minus(1) ?: 0

        println("${jugador1[0].nombre} usó ${lista1[ataqueAelegirJug1]}!")
        jugador2[0].recibirAtaque(lista1[ataqueAelegirJug1])

        if (jugador2[0].vida <= 0) {
            println(
                "${jugador2[0].nombre} se debilitó.\n" +
                        "" +
                        "gana ${jugador1[0].nombre} con ${jugador1[0].vida} de vida restante"
            )
            jugador2.removeAt(0)
            break
        }
        // Elegir el ataque del segundo Pokemon
        println("Es el turno de ${jugador2[0].nombre}.                  Vida Total:${jugador2[0].vida}" +
                "\nElige un ataque:")
        println("---------")
        lista2.forEachIndexed { index, ataque -> println("${index+1}. $ataque") }
        println("---------")

        var ataqueAelegirJug2 = readLine()?.toInt()?.minus(1) ?: 0
        // Mostrar los ataques que se van a realizar
        println("${jugador2[0].nombre} usó ${lista2[ataqueAelegirJug2]}!")
        println("---------------")
        // Calcular el daño que reciben los Pokemon
        jugador1[0].recibirAtaque(lista2[ataqueAelegirJug2])
        if (jugador1[0].vida <= 0) {
            println(
                "${jugador1[0].nombre} se debilitó.\n" +
                        "" +
                        "gana ${jugador2[0].nombre} con ${jugador2[0].vida} de vida restante"
            )
            jugador1.removeAt(0)
            break
        }
    }

    println("Fin de la Partida")
}