package Proyecto_Pokemon


fun main(){

    var pikachu = Pokemon("Pikachu", "Ratón eléctrico", Tipo("Electrico"), 100, 100)
    var charmander = Pokemon("Charmander", "Lagarto de fuego", Tipo("Fuego"), 90, 150)

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
    var turno = 1
    while (pikachu.vida > 0 && charmander.vida > 0) {
        // Mostrar el turno actual
        println("Turno $turno:")
        println("")
        // Elegir el ataque del primer Pokemon
        println("Es el turno de ${pikachu.nombre}. Elige un ataque:")
        println("---------")
        mostrarAtaquesPick()
        println("---------")
        var ataqueAElegirPick = readln()
        // Elegir el ataque del segundo Pokemon
        println("Es el turno de ${charmander.nombre}. Elige un ataque:")
        println("---------")
        mostrarAtaquesChar()
        println("---------")
        var ataqueAElegirChar = readln()
        // Mostrar los ataques que se van a realizar
        println("${pikachu.nombre} usó ${ataqueAElegirPick}!")
        println("${charmander.nombre} usó ${ataqueAElegirChar}!")
        println("---------------")
        // Calcular el daño que reciben los Pokemon
        charmander.recibirAtaque(pikachu.atacar(ataqueAElegirPick,charmander))
        if (charmander.vida <= 0) {
            println("${charmander.nombre} se debilitó.")
            break
        }
    }


        /*
        val equipo1 = listOf(pikachu)
        val equipo2 = listOf(charmander)

        // variables para el combate

        var batallaAcabada = false
        var equipo1Derrotado = false
        var equipo2Derrotado = false
        var contadorTurnos = 0
        var pokemonSeleccionado = 0
        var pokemonElegidoBoolean = false

        // Comenzamos el combate
        println("¡Comienza el combate!")
        var equipoActivo = equipo1
        var equipoRival = equipo2

        while (batallaAcabada == false){
            contadorTurnos += 1

            println(" Empieza el turno $contadorTurnos\n\n")

            println("Turno del equipo 1\n")

            while (pokemonElegidoBoolean == false){

                println("Elige el pokemon de tu equipo por su posición:\n" +
                        "$equipo1\n")
                var selectorPokemon = readln().toInt()

                pokemonSeleccionado = selectorPokemon-1
                pokemonElegidoBoolean= true



            }

            if (contadorTurnos>= 100) batallaAcabada= true









        }*/
}