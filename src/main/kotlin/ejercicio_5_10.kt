
/*
Queremos mantener una colección de los libros que hemos ido leyendo,
 poniéndoles una calificación según nos haya gustado más o menos al leerlo.
Para ello, crear la clase Libro, cuyos atributos son el título,
el autor, el número de páginas y la calificación que le damos entre 0 y 10.
Crear los métodos para poder modificar y obtener los atributos (sólo si tienen sentido).
Posteriormente, crear una clase ConjuntoLibros,
que almacena un conjunto de libros (con un vector de un tamaño fijo).
Se pueden añadir libros que no existan (siempre que haya espacio), eliminar libros por título o autor,
 mostrar por pantalla los libros con la mayor y menor calificación y, por último,
  mostrar un contenido de todo el conjunto.
En el programa principal realizar las siguientes operaciones:
 crear dos libros, añadirlos al conjunto, eliminarlos por los dos criterios (título y autor)
 hasta que el conjunto esté vacío, volver a añadir un libro y mostrar el contenido final.

 */

class Libros(val titulo:String, val autor:String, val paginas:Int, val calificacion:Int) {

 init {
  if (calificacion <10 || calificacion >0)
  println("La calificación debe ser entre 1 y 10")
    }

 
    fun obtenerTitulo():String{
      return titulo
    }
    fun obtenerAutor():String{
      return autor
    }
    fun obtenerPaginas():Int{
     return paginas
    }
    fun obtenerCalificacion():Int{
     return calificacion
    }
}
class ConjuntoLibros(){
 var almacena: MutableList<Libros> =ArrayList(5)

 fun añadeLibro(libros: Libros){
  almacena.add(libros)
 }
 fun deleteLibroTitulo(titulo:String) = almacena.removeIf {titulo.equals(it.titulo)}

 fun deleteLibroAutor(autor:String) = almacena.removeIf {autor.equals(it.autor)}

 fun calificacionAlta():String {
  var alta = almacena.sortedBy{ Libros -> Libros.calificacion}
 return "La calificación más alta es: $alta.last().titulo"
 }
 fun calificacionBaja ():String{
 var baja = almacena.sortedBy{Libros -> Libros.calificacion}
 return "La calificación más baja es: $baja.first().titulo"
}
fun ordenar():String {
 for (i in almacena.size -1){
     println(
      "titulo($almacena.get(i).titulo), + autor($almacena.get(i).autor), páginas($almacena.get(i)paginas), calificación($almacena.get(i).calificacion)")
 }
}
}
fun main(){
    var libro1:Libros=Libros("Lingüística germánica","Hans Krahe",399,9)
    var libro2:Libros=Libros("Er ist wieder da","Timur Vermes",396,7)
    listOf(libro1)
    listOf(libro2)
}
