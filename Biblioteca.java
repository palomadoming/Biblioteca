package Ejercicio_Clase;

import java.util.ArrayList;
import java.util.List;


/* Clase Biblioteca donde los usuarios pueden buscar los libros */



public class Biblioteca {
    private List<Estanteria> estanterias;

    // Constructor
    public Biblioteca() {
        estanterias = new ArrayList<>();
    }

    // Métodos para agregar una estantería 
    public void agregarEstanteria(Estanteria estanteria) {
        estanterias.add(estanteria);
    }

    // Método para eliminar una estanteria
    public void eliminarEstanteria(Estanteria estanteria) {
        estanterias.remove(estanteria);
    }

    public List<Estanteria> getEstanterias() {
        return estanterias;
    }
    
    // Método para mostrar todos los géneros y sus libros
    public void mostrarEstanterias() {
        System.out.println("=== Estanterías en Biblioteca ===");
        for (Estanteria estanteria : estanterias) {
            System.out.println(estanteria.toString());
        }
    }
}
