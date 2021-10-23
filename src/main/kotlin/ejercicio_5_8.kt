import java.time.LocalDate

/*
Ejercicio 5.8
Crear una clase Tiempo, con atributos hora, minuto y segundo, que pueda ser construida
indicando los tres atributos, sólo hora y minuto o sólo la hora
(si no se indica, el valor de minuto o segundo será 0).
Crear el método toString para mostrar el tiempo en formato: XXh XXm XXs
En el programa principal, debe solicitar por teclado hora, minuto y segundo
de forma que se puedan omitir los segundos o los minutos (y segundos, claro)
e instancie la clase Tiempo mostrando su valor.
*/

class Tiempo(val hora:Int, val minuto:Int=0, val segundo:Int=0) {
    override fun toString(): String {
        return ""+hora+"h "+minuto+"m "+segundo+"s "
    }
}
fun main () {

//Solito la hora
    try{
    println("Dime la hora")
    var hora = readLine()!!.toInt()
    }catch (e: Exception){
        println("El valor debe ser un número")
    }
    //comprobar que hora al pasarlo a entero no da excepción. Sino, salgo del prgrama

    //Solito la minutos
    try {
    println("Dime la minutos")
    var minutos = readLine()!!.toInt()
    }catch (e:Exception({
        println("El valor debe ser un número")
    }
    //comprobar que minuto al pasarlo a entero no da excepción. Sino, minuto = 0

    //Solito la segundos
    try{
    println("Dime la segundos")
    var segundos = readLine()!!.toInt()
    }catch (e:Exception){
        println("El valor debe ser un número")
    }
    //comprobar que minuto al pasarlo a entero no da excepción. Sino, minuto = 0

    var t: Tiempo?

    when {
        minutos == 0 && segundos==0 -> t = Tiempo(hora)
        segundos==0 -> t = Tiempo(hora, minutos)
        else -> t = Tiempo(hora, minutos, segundos)
    }

}


