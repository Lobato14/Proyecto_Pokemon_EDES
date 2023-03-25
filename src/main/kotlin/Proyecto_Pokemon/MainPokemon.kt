package Proyecto_Pokemon

fun main(){

    var pikachu = Pokemon("Pikachu", "Ratón eléctrico", Tipo("eléctrico"), 100, 100)
    var charmander = Pokemon("Charmander", "Lagarto de fuego", Tipo("fuego"), 90, 150)
    var bulbasur = Pokemon("Bulbasur", "Bicho Planta", Tipo("planta"), 50, 90)
    var machamp = Pokemon("Machamp", "Luchador", Tipo("lucha"), 70, 60)
    var squirtle = Pokemon("Squirtle", "Tortuga de Agua", Tipo("agua"), 30, 45)

    var listaPokemon = listOf<Pokemon>(pikachu,charmander,bulbasur,machamp,squirtle)



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

    fun mostrarAtaque(pokemon: Pokemon){
        when (pokemon.tipo.tipo){
            "eléctrico" -> println(ataquesElectrico)
            "fuego" -> println(ataquesFuego)
            "agua" -> println(ataquesAgua)
            "lucha" -> println(ataquesLucha)
            "planta" -> println(ataquesPlanta)
        }
    }

    var Equipo1 = mutableListOf<Pokemon>()
    var Equipo2 = mutableListOf<Pokemon>()


    // Muestra la lista de los pokemon
    println("---Elige un Pokemon------")
    fun mostrarlistaPokemon(){
        for(pokemon in listaPokemon){
            println("Nombre: ${pokemon.nombre}, Lore: ${pokemon.lore}, Tipo: ${pokemon.tipo}, Fuerza: ${pokemon.fuerza}, Vida: ${pokemon.vida}")
        }
    }
    mostrarlistaPokemon()
    var elegirpokemon1 = readln().toInt()-1
    Equipo1.add(listaPokemon[elegirpokemon1])

    var ataques = mapOf("eléctrico" to ataquesElectrico, "fuego" to ataquesFuego, "agua" to ataquesAgua,
        "lucha" to ataquesLucha, "planta" to ataquesPlanta)
    var tipo1 = Equipo1[0].tipo.toString()
    var lista1 = ataques.get(tipo1)

    println("---Elige un Pokemon------")
    mostrarlistaPokemon()
    var elegirpokemon2 = readln().toInt()-1
    Equipo2.add(listaPokemon[elegirpokemon2])


    // Mostrar los Pokemon que se enfrentarán
    println("------------------------------------")
    println("---¡COMIENZA LA BATALLA POKEMON!----")
    println("------${Equipo1[0].nombre} VS ${Equipo2[0].nombre}------")
    println("------------------------------------")

    // Turno del primer Pokemon
    var turno = 0
    while (Equipo1.size > 0 && Equipo2.size > 0) {
        turno += 1
        // Mostrar el turno actual
        println("Turno $turno:")
        println("")
        // Elegir el ataque del primer Pokemon
        println(
            "Es el turno de ${Equipo1[0].nombre}.                  Vida Total:${Equipo1[0].vida}" +
                    "\nElige un ataque:"
        )
        println("---------")
        println(lista1)
        var ataqueAelegir = readln()
        println("---------")

    }
        /*var ataqueAElegirPick = readln().toInt() - 1
        charmander.recibirAtaque(ataquesPikachu[ataqueAElegirPick])
        if (Equipo2[0].vida <= 0) {
            println(
                "${Equipo2[0].nombre} se debilitó.\n" +
                        "" +
                        "gana ${Equipo1[0].nombre} con ${Equipo1[0].vida} de vida restante"
            )
        }

        // Elegir el ataque del segundo Pokemon
        println("Es el turno de ${Equipo2[0].nombre}.                  Vida Total:${Equipo2[0].vida}" +
                "\nElige un ataque:")
        println("---------")
        mostrarAtaques2()
        println("---------")

        var ataqueAElegirChar = readln().toInt() - 1
        // Mostrar los ataques que se van a realizar
        println("${Equipo1[0].nombre} usó ${ataquesPikachu[ataqueAElegirPick]}!")
        println("${Equipo2[0].nombre} usó ${ataquesCharmander[ataqueAElegirChar]}!")
        println("---------------")
        // Calcular el daño que reciben los Pokemon
        pikachu.recibirAtaque(ataquesCharmander[ataqueAElegirChar])
        if (Equipo1[0].vida <= 0) {
            println(
                "${Equipo1[0].nombre} se debilitó.\n" +
                        "" +
                        "gana ${Equipo2[0].nombre} con ${Equipo2[0].vida} de vida restante"
            )
        }
    }*/
}