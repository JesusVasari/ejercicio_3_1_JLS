/**
 * @author Jesus Lopez
 */

/**
 * @param esta clase crea el rectángulo con su altura y su base
 */
class Rectangulo(val altura:Int, val base:Int) {

    // esta función calcula el área del rectángulo
    fun area(): Int {
        return altura*base
    }
    //esta función calcula el perímetro del rectángulo
    fun perimetro(): Int{
        return (altura * 2) + (base * 2)
    }
}
fun main(){
    var square:Rectangulo=Rectangulo(10, 10)
    println("el area es " + square.area())
    println("el perímetro es " + square.perimetro())

    var dos:Rectangulo=Rectangulo(altura = 15, base = 20)
    println("el area es " + dos.area())
    println("el perímetro es "+dos.perimetro())

    var tres:Rectangulo=Rectangulo(altura = 30, base = 50)
    println(" el area es "+tres.area())
    println("el perímetro es "+tres.perimetro())
}