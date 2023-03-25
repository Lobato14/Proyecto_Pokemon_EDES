package Proyecto_Pokemon


fun main(){

    val pikachu = Pokemon("Pikachu", "Ratón eléctrico", Tipo("Electrico"), 100, 100)
    val charmander = Pokemon("Charmander", "Lagarto de fuego", Tipo("Fuego"), 90, 90)

    /*val bulbasaur = Pokemon("Bulbasaur", "Planta con bulbosa", Tipo("Hierba"), 80, 80)
    val squirtle = Pokemon("Squirtle", "Tortuguita de agua", Tipo("Agua"), 70, 70)*/

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









    }
}