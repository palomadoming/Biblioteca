package Ejercicio_Clase;

public class Main {
    public static void main(String[] args) {

        // Crear autores
        Autor autor1 = new Autor("JK Rowling"); 
        Autor autor2 = new Autor("Stephen King");

        // Crear libros y Revistas
        Libro libro1 = new Libro("El Señor de los Anillos",autor1, 20.5);
        Libro libro2 = new Libro("Steve Jobs", autor2, 40.0); 
        Libro libro3 = new Libro("El Principito", autor2, 14.3); 
        Revista revista1 = new Revista("Thrasher", autor1, 10.0);
        Revista revista2 = new Revista("National Geographic", autor1, 15.0);

        // Crear Estanterías y agregar libros
        Estanteria estanteria1 = new Estanteria("Historia");
        estanteria1.agregarLibro(libro1);
        estanteria1.agregarLibro(libro2);
        estanteria1.agregarRevista(revista1);
        estanteria1.agregarRevista(revista2);

        Estanteria estanteria2 = new Estanteria("Infantil");
        estanteria2.agregarLibro(libro3);
        estanteria2.agregarRevista(revista1);

        // Crear biblioteca y agregar estanterías
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarEstanteria(estanteria1);
        biblioteca.agregarEstanteria(estanteria2);

        // Mostrar todas las estanterias y sus libros
        biblioteca.mostrarEstanterias();
    }
}