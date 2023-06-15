
package app;

import entidades.Libro;
import entidades.Perro;
import java.util.ArrayList;
import java.util.HashSet;


public class ObjetoColeccion {


    public static void main(String[] args) {
        
        //definimos un ArrayList de tipo Libro
        ArrayList<Libro> libros = new ArrayList();
        //definimos  OBJs de tipo Libro y lo añadimos al ArrayList
        Libro libro1 = new Libro("Matematicas", "Juan Vilchez");
        Libro libro2 = new Libro("Algebra", "Luciano Morris");
        Libro libro3 = new Libro("Geometria", "Carolina Mejia");
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        
        //definimos un conjunto de tipo Perro
        HashSet<Perro> perros = new HashSet();
        Perro perro1 = new Perro("Miksy", "Peruano");
        Perro perro2 = new Perro("Lalas", "Chusquis Vulgaris");
        Perro perro3 = new Perro("Chato", "Damlata");
        perros.add(perro1);
        perros.add(perro2);
        perros.add(perro3);
                
        //definimos mapas de tipo alumno
        
    }
    
}
