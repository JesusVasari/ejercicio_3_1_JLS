/*
Se quiere crear una clase Cuenta la cual se caracteriza por tener asociado un número de cuenta
y un saldo disponible. Además, se puede consultar el saldo disponible, recibir abonos y realizar pagos.

Crear además una clase Persona, que se caracteriza por un DNI y un vector
 (Preguntar al profesor si tienes dudas sobre vector) de cuentas bancarias.
 La Persona puede tener asociada hasta 3 cuentas bancarias,
 y debe tener un método que permita añadir cuentas (hasta 3 que es el máximo).
 También debe contener un método que devuelva si la persona es morosa
 (si tienen alguna cuenta con saldo negativo).
En el programa principal, instanciar un objeto Persona con un DNI cualquiera,
así como dos objetos cuenta, una sin saldo inicial y otra con 700 euros.
La persona recibe la nómina mensual, por lo que ingresa 1100 euros en la primera cuenta,

 pero tiene que pagar el alquiler de 750 euros con la segunda.
  Imprimir por pantalla si la persona es morosa.
Posteriormente hacer una transferencia de una cuenta a otra (de forma que todos los saldos sean positivos)
y mostrar por pantalla el estado de la persona.

 */



/*
class Cuenta (val numeroCuenta:String, val saldo:Double=0.0) {
    override fun toString(): String {
        return "El número de cuenta es: $numeroCuenta y su saldo es: $saldo"
    }
    //hasta aquí con los parámetros de los dos objetos de cuenta funciona

    fun cobraSueldo():Double {
        var cobra:Double = cobraSueldo()+this.saldo
          return  this.saldo
    }
    fun realizarPago():Double {
        var paga:Double = realizarPago()-this.saldo
          return  this.saldo
    }
    fun consultaSaldo():Double{
        this.saldo
        return saldo
    }
}
class Persona (val DNI:String){

    var cuentasBancarias:MutableList<Cuenta> =ArrayList(3)

    fun addCuenta(cuenta:Cuenta){
        cuentasBancarias.add(cuenta)
    }




}

fun main(){
    var persona:Persona=Persona("48394002Q")
    var cuenta1:Cuenta=Cuenta("2323232323",saldo =0.0,)

    var unConjuntoDeCuentas=Persona("48394002Q")
    unConjuntoDeCuentas.addCuenta(cuenta1)
    println(cuenta1)
    cuenta1.cobraSueldo()      //1100

    var cuenta2:Cuenta=Cuenta("3434343434",saldo = 700.0)
    unConjuntoDeCuentas.addCuenta(cuenta2)
    println(cuenta2)
    cuenta2.realizarPago()   //750
}
*/
