package Ejercicio_Clase;


/* Clase Revista hereda de Stock y representa una revista */

public class Revista extends Stock{
    private Autor autor; //Atributo autor

    //Constructor
    public Revista(String titulo, Autor autor, double precio) {
        super(titulo, precio); // LLamada al constructos de Stock
        this.autor = autor;  // Asignamos el autor
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
        return "Revista: " + super.toString() + " - Autor: " + autor.toString();
    }
    
}
