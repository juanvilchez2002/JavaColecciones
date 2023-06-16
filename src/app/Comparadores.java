/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import entidades.Libro;
import entidades.Perro;
import java.util.Comparator;

public class Comparadores {
    //para ordenar ArrayList, HashSet y HashMap, el metodo sort de Collections
    //no ayuda a procesar esta tarea xq los atributos no son uniformes
    //para ello se tiene a los comparator, que toman un atributo y lo ordena
    
    //ordenando el objeto de tipo Libro - Descendente Autor
    public static Comparator<Libro> ordenarLibrosAutorDesc = new Comparator<Libro>() {
        @Override
        public int compare(Libro o1, Libro o2) {
            return o2.getAutor().compareTo(o1.getAutor());
        }
    };
    
    //ordenando el objeto de tipo Libro - ascendente Nombre
    public static Comparator<Libro> ordenarLibrosNombre = new Comparator<Libro>() {
        @Override
        public int compare(Libro o1, Libro o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };
            
    //ordenamos el objeto de tipo Perro - Edad
    public static Comparator<Perro> ordenarEdadPerro = new Comparator<Perro>() {
        @Override
        public int compare(Perro o1, Perro o2) {
            return o1.getEdad().compareTo(o2.getEdad());
        }
    };
    
}
