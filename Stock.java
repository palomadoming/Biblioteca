package Ejercicio_Clase; 

/* Clase abstracta Stock de la Biblioteca.
 * Es la clase base para cualquier tipo de stock que se pueda tener en la biblioteca, 
 * ya sea un libro o una revista.
 */

public abstract class Stock {
    protected String titulo;
    protected double precio; // en euros

    public Stock(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return titulo + " (" + precio + " euros)";  //DUDA IMPORTANTE SIMBOLO DE EURO?? 
    }
}

