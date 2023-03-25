package Proyecto_Pokemon


fun main(){



    var pikachu = Pokemon("Pikachu", "Ratón eléctrico", Tipo("Electrico"), 100, 100)
    var charmander = Pokemon("Charmander", "Lagarto de fuego", Tipo("Fuego"), 90, 150)
    var bulbasur = Pokemon("Bulbasur", "Bicho Planta", Tipo("hierba"), 50, 90)
    var machamp = Pokemon("Machamp", "Luchador", Tipo("lucha"), 70, 60)
    var squirtle = Pokemon("Squirtle", "Tortuga de Agua", Tipo("agua"), 30, 45)
    var listaPokemon = listOf<Pokemon>(pikachu,charmander,bulbasur,machamp,squirtle)


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
        Equipo1[0].mostrarAtaque()
        println("---------")
        break
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