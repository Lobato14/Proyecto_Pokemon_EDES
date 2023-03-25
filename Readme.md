# PROYECTO POKEMON
<hr>

POKEMON es un juego de lucha uno contra uno en donde los jugadores tienen un pokemon y dicho pokemon tiene una serie de ataques según el tipo de pokemon que sea.

Dichos ataques tendrá más efecto o menos efecto dependiendo del tipo de pokemon que lanze el ataque con lo cual le restará más vida o menos vida.
<hr>

## Clase ``Jugador``

En la clase de jugador nos muestra el nombre del pokemon que nos los mostrará por pantalla.

```
class Jugador(pokemon:String) {
    var pokemon = pokemon
    // Inicializamos la variable pokemon
    init {
        this.pokemon = pokemon
    }
}
```
<hr>

## Clase ``Ataque``

La clase Ataque nos muestra el nombre del pokemon junto al tipo y el daño que llega a hacer.

````
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
    // Función to String
    override fun toString(): String {
        return "Pokemon(nombre='$nombre', tipo=$tipo, danio=$danio)"
    }

}
````
<hr>

## Clase ``Pokemon``

La clase Pokemon nos muestra el nombre, el tipo, el lore, la fuerza y la vida de dicho pokemon gracias a una función que nos muestra toda su información.

````
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


}
``````
<hr>

## Clase Tipo

En la clase Tipo se muestra el tipo de pokemon, la efectividad que tiene contra otros pokemon y según eltipo de pokemon tendrá una efectividad u otra y nos mostrará el tipo de efectividad que tiene.

````
fun comprobarEfectividad(tipoAtaque: Tipo): Efectividad {
        return when (tipo) {
            "fuego" -> when (tipoAtaque.tipo) {
                "hierba" -> Efectividad.MUY_EFECTIVO
                "agua" -> Efectividad.POQUITO_EFECTIVO
                else -> Efectividad.NORMAL
            }
            "agua" -> when (tipoAtaque.tipo) {
                "fuego" -> Efectividad.MUY_EFECTIVO
                "hierba" -> Efectividad.POQUITO_EFECTIVO
                else -> Efectividad.NORMAL
            }
            "hierba" -> when (tipoAtaque.tipo) {
                "agua" -> Efectividad.MUY_EFECTIVO
                "fuego" -> Efectividad.POQUITO_EFECTIVO
                else -> Efectividad.NORMAL
            }
            "normal" -> Efectividad.NORMAL
            "eléctrico" -> when (tipoAtaque.tipo) {
                "agua" -> Efectividad.MUY_EFECTIVO
                "hierba" -> Efectividad.POQUITO_EFECTIVO
                "normal" -> Efectividad.POQUITO_EFECTIVO
                else -> Efectividad.NORMAL
            }
            "lucha" -> when (tipoAtaque.tipo) {
                "normal" -> Efectividad.MUY_EFECTIVO
                "hierba" -> Efectividad.POQUITO_EFECTIVO
                else -> Efectividad.NORMAL
            }
            else -> Efectividad.NORMAL
        }
    }
````

