package Ejercicio_Clase;


/* Clase Libro hereda de Stock y representa un libro */

public class Libro extends Stock{

    private Autor autor; //Atributo autor

    //Constructor
    public Libro(String titulo, Autor autor, double precio){
        super(titulo, precio); //llamada al constructor del Stock
        this.autor = autor; //Asignamos el autor
    }

    // Getter y Setter para autor
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }


    @Override
    public String toString() {
        return "Libro: " + super.toString() + " - Autor: " + autor.toString();  
    }
}
