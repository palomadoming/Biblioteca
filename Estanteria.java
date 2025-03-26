package Ejercicio_Clase;

import java.util.ArrayList;
import java.util.List;


public class Estanteria {

    private String nombre; // TipoGenero en lugar de String
    private List<Libro> libros;
    private List<Revista> revistas;

   // Constructor
    public Estanteria(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.revistas = new ArrayList<>();
    }

    // Getter y Setter para el nombe
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para agregar un libro a la lista de libros
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para eliminar un libro de la lista de libros
    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    // Método para agregar una revista a la lista de revistas
    public void agregarRevista(Revista revista) {
        revistas.add(revista);
    }

    // Método para eliminar una revista de la lista de revistas
    public void eliminarRevista(Revista revista) {
        revistas.remove(revista);
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public List<Revista> getRevistas() {
        return revistas;
    }

    // Método para obtener la representación del objeto en formato String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estantería: " + nombre + "\n");
        
        // Iterar sobre los libros
        for (Libro libro : libros) {
            sb.append(" " + libro.toString() + "\n");
        }
        
        // Iterar sobre las revistas
        for (Revista revista : revistas) {
            sb.append(" " + revista.toString() + "\n");
        }
        
        return sb.toString();
}

}
