
package app;

import entidades.Alumno;
import entidades.Libro;
import entidades.Perro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


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
        //recorremos la lista
        System.out.println("Lista de Tipo Libro");
        for(Libro lib: libros){
            System.out.println(lib);
        }
        
        //definimos un conjunto de tipo Perro
        HashSet<Perro> perros = new HashSet();
        Perro perro1 = new Perro("Miksy", "Peruano");
        Perro perro2 = new Perro("Lalas", "Chusquis Vulgaris");
        Perro perro3 = new Perro("Chato", "Damlata");
        perros.add(perro1);
        perros.add(perro2);
        perros.add(perro3);
        //recorremos el conjunto
        System.out.println("");
        System.out.println("Conjunto de tipo Perro");
        for(Perro per: perros){
            System.out.println(per);
        }
                
        //definimos mapas de tipo alumno
        HashMap<Integer, Alumno> alumnos = new HashMap();
        int dni1=42759062;
        Alumno alumno1 = new Alumno("Juan", "Vilchez");
        int dni2=14151616;
        Alumno alumno2 = new Alumno("Luis", "Solano");
        int dni3=28714595;
        Alumno alumno3 = new Alumno("Alex", "Mendil");
        alumnos.put(dni1, alumno1);
        alumnos.put(dni2, alumno2);
        alumnos.put(dni3, alumno3);
        //recorremos el Mapa de tipo Alumno
        System.out.println("");
        System.out.println("Mapa de tipo Alumno");
        for(Map.Entry<Integer, Alumno> entry:alumnos.entrySet()){
            System.out.println("dni: "+entry.getKey()+" - nombre: "+entry.getValue());
        }
        
        
    }
    
}
