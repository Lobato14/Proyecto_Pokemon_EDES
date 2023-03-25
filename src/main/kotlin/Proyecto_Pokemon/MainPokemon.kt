package Proyecto_Pokemon


fun main(){

    var pikachu = Pokemon("Pikachu", "Ratón eléctrico", Tipo("Electrico"), 100, 100)
    var charmander = Pokemon("Charmander", "Lagarto de fuego", Tipo("Fuego"), 90, 150)
    var bulbasur = Pokemon("Bulbasur", "Bicho Planta", Tipo("hierba"), 50, 90)
    var machamp = Pokemon("Machamp", "Luchador", Tipo("lucha"), 70, 60)
    var squirtle = Pokemon("Squirtle", "Tortuga de Agua", Tipo("agua"), 30, 45)


    var Equipo1 = mutableListOf<Pokemon>()
    var Equipo2 = mutableListOf<Pokemon>()

    var elegirpokemon1 = readln().toInt()

    Equipo1.add(listaPokemon[elegirpokemon1])

    var elegirpokemon2 = readln().toInt()

    Equipo2.add(listaPokemon[elegirpokemon2])





    // Listas de ataques de Picachu
    var ataquesPikachu = listOf(
        Ataque("Impactrueno", Tipo("eléctrico"), 20),
        Ataque("Cola Ferrea", Tipo("acero"), 10),
        Ataque("Rayo", Tipo("eléctrico"), 40),
        Ataque("Descarga", Tipo("eléctrico"), 25)
    )
    // Listas de ataques de Charmander
    var ataquesCharmander = listOf(
    Ataque("Lanzallamas", Tipo("fuego"), 35),
    Ataque("Arañazo", Tipo("normal"), 10),
    Ataque("Ascuas", Tipo("fuego"), 25),
    Ataque("Gruñido", Tipo("normal"), 5)
    )

    fun mostrarAtaquesPick() {
        for (ataque in ataquesPikachu) {
            println("${ataque.nombre} - Tipo: ${ataque.tipo} - Daño: ${ataque.danio}")
        }
    }

    fun mostrarAtaquesChar(){
        for (ataque in ataquesCharmander) {
            println("${ataque.nombre} - Tipo: ${ataque.tipo} - Daño: ${ataque.danio}")
        }
    }

    // Mostrar los Pokemon que se enfrentarán
    println("------------------------------------")
    println("---¡COMIENZA LA BATALLA POKEMON!----")
    println("------${pikachu.nombre} VS ${charmander.nombre}------")
    println("------------------------------------")

    // Turno del primer Pokemon
    var turno = 0
    while (pikachu.vida > 0 && charmander.vida > 0) {
        turno +=1
        // Mostrar el turno actual
        println("Turno $turno:")
        println("")
        // Elegir el ataque del primer Pokemon
        println("Es el turno de ${pikachu.nombre}.                  Vida Total:${pikachu.vida}" +
                "\nElige un ataque:")
        println("---------")
        mostrarAtaquesPick()
        println("---------")

        var ataqueAElegirPick = readln().toInt() - 1
        charmander.recibirAtaque(ataquesPikachu[ataqueAElegirPick])
        if (charmander.vida <= 0) {
            println(
                "${charmander.nombre} se debilitó.\n" +
                        "" +
                        "gana ${pikachu.nombre} con ${pikachu.vida} de vida restante"
            )
        }

        // Elegir el ataque del segundo Pokemon
        println("Es el turno de ${charmander.nombre}.                  Vida Total:${charmander.vida}" +
                "\nElige un ataque:")
        println("---------")
        mostrarAtaquesChar()
        println("---------")

        var ataqueAElegirChar = readln().toInt() - 1
        // Mostrar los ataques que se van a realizar
        println("${pikachu.nombre} usó ${ataquesPikachu[ataqueAElegirPick]}!")
        println("${charmander.nombre} usó ${ataquesCharmander[ataqueAElegirChar]}!")
        println("---------------")
        // Calcular el daño que reciben los Pokemon
        pikachu.recibirAtaque(ataquesCharmander[ataqueAElegirChar])
        if (pikachu.vida <= 0) {
            println(
                "${pikachu.nombre} se debilitó.\n" +
                        "" +
                        "gana ${charmander.nombre} con ${charmander.vida} de vida restante"
            )
        }
    }
}