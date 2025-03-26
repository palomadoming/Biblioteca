# BIBLIOTECA

## Ejercicio diferentes clases de una Biblioteca en Java

### Objetivo personal:

Poner en práctica los conocimientos aprendidos sobre las clases en Java utilizando un ejemplo real de una Biblioteca.

### ¿De qué trata este ejercicio?

A partir de diferentes clases como: 

Autor.java -> se define el autor del libro o la revista con el atributo nombre.
Stock.java -> Clase abstracta Stock, es la clase base para cualquier tipo de stock que se pueda tener en la biblioteca. Tiene los atributos: título y precio.
Libro. java -> Hereda de la clase Stock.java y representa el objeto Libro con los atributos: título, autor y precio.
Revista.java -> Hereda de la Clase Stock.java y representa el objeto Revista con los atributos: título, autor y precio.
Estanteria.java -> Con atributos como: nombre (nombre de la sección, ej: "Historia"); lista de libros; lista de revistas (ArrayList). Además se puede agregar y eliminar Libro / Revista a la lista.
Biblioteca.java -> Clase donde los usuarios pueden buscar los libros o revistas de la Biblioteca.
Main.java -> Clase principal del programa donde se invocan a todas las clases y se crean los autores, libros, revistas, estanterías y la biblioteca, para finalmente mostrar todas las estanterías y sus libros.
