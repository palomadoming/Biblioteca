package Ejercicio_Clase;

public class Autor {
    private String nombre;
    
    //Constructor
    public Autor(String nombre){
        this.nombre = nombre;
    }
    
    // Getter y Setter
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
}
