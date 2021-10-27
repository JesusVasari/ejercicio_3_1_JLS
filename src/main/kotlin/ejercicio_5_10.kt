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

class Libro(val titulo: String, val autor: String, val paginas: Int, val calificacion: Int) {

    init {
        if (calificacion > 10 || calificacion < 1)
            println("La calificación debe ser entre 1 y 10")
    }

    override fun toString(): String {
        return "titulo $titulo, autor$autor, páginas$paginas, calificación$calificacion"
    }
}

class ConjuntoLibros() {
    var almacen: MutableList<Libro> = ArrayList(5)

    fun añadeLibro(libro: Libro) {
        almacen.add(libro)
    }

    fun deleteLibroTitulo(titulo: String) = almacen.removeIf { titulo.equals(it.titulo) }

    fun deleteLibroAutor(autor: String) = almacen.removeIf { autor.equals(it.autor) }

    fun calificacionAlta(): Libro {
        var alta = almacen.sortedBy { Libros -> Libros.calificacion }
        return alta.last()
    }

    fun calificacionBaja(): Libro {
        var baja = almacen.sortedBy { Libros -> Libros.calificacion }
        return baja.first()
    }

    override fun toString(): String {
        var cjtoLibrosDesc = ""
        for (libro in almacen) {
            cjtoLibrosDesc+="$libro\n"
        }
        return cjtoLibrosDesc
    }
}

fun main() {
    var libro1: Libro = Libro("Lingüística germánica", "Hans Krahe", 399, 9)
    var libro2: Libro = Libro("Er ist wieder da", "Timur Vermes", 396, 7)

    var unCojuntoDeLibros = ConjuntoLibros()
    unCojuntoDeLibros.añadeLibro(libro1)
    unCojuntoDeLibros.añadeLibro(libro2)
    println("Creados dos libros")
    println(unCojuntoDeLibros)

    unCojuntoDeLibros.deleteLibroAutor("Hans Krahe")
    println("Borrado un libro libros")
    println(unCojuntoDeLibros)

    unCojuntoDeLibros.deleteLibroTitulo("Er ist wieder da")
    println("Borrado los dos libros libros")
    println(unCojuntoDeLibros)
}
