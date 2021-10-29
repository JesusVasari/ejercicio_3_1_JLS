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
/**
 * @param la clase tiene número de cuenta y su saldo
 */
class Cuenta (var numeroCuenta:String, var saldo:Double=0.0) {

/*
class Cuenta (val numeroCuenta:String, val saldo:Double=0.0) {

    override fun toString(): String {
        return "El número de cuenta es: $numeroCuenta y su saldo es: $saldo"
    }
    //hasta aquí con los parámetros de los dos objetos de cuenta funciona

    fun cobraSueldo(cantidad:Double):String {
        saldo += cantidad
        return "se ha cobrado: $cantidad"
    }
    fun realizarPago(cantidad: Double):String {
        saldo -= cantidad
        return "se ha pagado: $cantidad"
    }
    fun consultaSaldo():String {

        return "El saldo de la cuenta es $saldo"
    }
}

/**
 * @param se crea la clase persona que tiene un DNI y una cantidad de cuenta en un vector
 */
class Persona (val DNI:String){

    var cuentasBancarias=Array(3) {Cuenta("",0.0)}
    var cuentaAlmacenada:Boolean =false
    var contador =0
    var morosa :Boolean=false
    var finaliza:Boolean=false

    /**
     * @param crea la clase para insertar una cuenta,para que ocupe el hueco en el caso de no haber cuenta
     * la cuenta se almacena en el hueco libre y no en el siguiente punto del vector
     */
    fun addCuenta(cuenta:Cuenta):String{
        cuentaAlmacenada=false
        contador=0   //se pone un contador a 0 para ir añadiendo cuenta
        finaliza = false  //en el caso de que sea falso se realiza la siguiente acción
        while (finaliza.equals(false)) {
            if (cuentasBancarias[contador].numeroCuenta.toString() == "0") {
                cuentasBancarias[contador] = cuenta
                cuentaAlmacenada = true   //cuando el array se completa se finaliza la acción
                finaliza = true
            }
            contador+1
            if (contador > 2) { //se pone un 2 porque la array empieza en 0
                finaliza = true
            }

        }
        return if (cuentaAlmacenada == true) {
            "La persona $DNI tiene la cuenta ${cuenta.numeroCuenta}"
        } else {
            "No se puede crear una cuenta"
        }
    }
    fun personaMorosa(): String {
        contador = 0
        morosa = false
        finaliza = false
        while (finaliza.equals(false)) {
            if (cuentasBancarias[contador].saldo < 0.0) {
                morosa = true
                contador+1
            }
            contador+1
            if (contador > 2)
                finaliza = true
        }
        return if (morosa == true) {
          "La persona $DNI es morosa"
        } else {
            "La persona $DNI no es morosa"
        }
    }

    fun trasferenciaDinero (cuentaPrimera:Cuenta, cuentaSegunda:Cuenta, cantidad:Double):String{
        cuentaPrimera.realizarPago(cantidad)
        cuentaSegunda.cobraSueldo(cantidad)
        return "La cuenta ${cuentaPrimera.numeroCuenta} recibe de $cantidad de la cuenta ${cuentaSegunda.numeroCuenta}"

    }

    /**
     * @param cuentasPersona instancia cada cuenta en cada punto de la array creada anteriormente llamada
     * CuentaBancaria con tres cuentas como máximo
     */
    fun cuentasPersona(): String = "${cuentasBancarias[0]}, ${cuentasBancarias[1]}, ${cuentasBancarias[2]}"

}

fun main(){
    var persona:Persona=Persona("48394002Q")

    var cuenta1:Cuenta=Cuenta("2323232323",saldo =0.0,)
    persona.addCuenta(cuenta1)
    println(cuenta1.cobraSueldo(1100.00))


    var cuenta2:Cuenta=Cuenta("3434343434",saldo = 700.0)
    persona.addCuenta(cuenta2)
    println(cuenta2.realizarPago(750.0))

    println(persona.trasferenciaDinero(cuenta1,cuenta2,500.0))
    println(persona.personaMorosa())
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
