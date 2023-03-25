package Proyecto_Pokemon

fun main(){

    val pikachu = Pokemon("Pikachu", "Ratón eléctrico", Tipo("Electrico"), 100, 100)
    val charmander = Pokemon("Charmander", "Lagarto de fuego", Tipo("Fuego"), 90, 90)
    val bulbasaur = Pokemon("Bulbasaur", "Planta con bulbosa", Tipo("Hierba"), 80, 80)
    val squirtle = Pokemon("Squirtle", "Tortuguita de agua", Tipo("Agua"), 70, 70)

    val equipo1 = listOf(pikachu, charmander)
    val equipo2 = listOf(bulbasaur, squirtle)

    // Comenzamos el combate
    println("¡Comienza el combate!")
    var equipoActivo = equipo1
    var equipoInactivo = equipo2



}