class Coche (val color:String, val marca:String, val modelo:String,
             val caballos:Int, val puertas:Int, val matricula:Int){

    override fun toString(): String {
        return "el coche es de color " +this.color+ " cuya marca es " +  this.marca + " ,modelo "+ this.modelo + ", el número de caballos son " +         this.caballos + ", el número de puertas son " + this.puertas + " y el número de matrícula es: "+ this.matricula
    }
}

fun main() {
    var car: Coche=Coche("negro","Audi","Clase C",240,5,4535)
    println(car)
    var auto:Coche=Coche(color = "blanco", "BMW", "clase A", 300,3,4932)
    println(auto)
    var che:Coche=Coche("azul","Ford","clase B",180,5,2919)
    println(che)
}
