package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {


    public static void main(String[] args) {
        
        System.out.println("Listas");
        //Listas
        //Ejemplo de un ArrayList de numeros
        ArrayList<Integer> numerosA = new ArrayList();
        
        //agregamos un valor
        int x = 20;
        int a = 1;
        int b = 10;
        int c = 5;
        int d = 11;
        int y = 30;
        
        numerosA.add(x);
        numerosA.add(a);
        numerosA.add(b);
        numerosA.add(c);
        numerosA.add(d);
        numerosA.add(y);
        
        //eliminamos un elemento por indice
        numerosA.remove(3);//elimina c
        //eliminamos un elemento por valor, para ello si es número por defecto
        //el remove lo considera como index, para ello debemos pasarle el valor
        //como un objeto
        numerosA.remove(new Integer(30)) ;//elemento d
        
        for(Integer num: numerosA){
            System.out.println(num);
        }
        
        //ordenando el arraylist, se usa sort de Colecctions
        Collections.sort(numerosA);
        System.out.println("");
        System.out.println("lista ordenada ");
        for(Integer num: numerosA){
            System.out.println(num);
        }
        
        
        //Ejemplo de un LinkeList de numeros
        //Los LinkedList puede recorrer hacia adelante y hacia atras
        LinkedList<Integer> numeroB = new LinkedList();
        
        
        
        System.out.println("");
        System.out.println("Conjuntos");
        //conjuntos
        //Ejemplo de un HashSet de cadenas
        HashSet<Integer> numerosB = new HashSet();
        
        //añadiendo valores
        int w= 20;
        int z= 10;
        int n= 15;
        int p= 3;
        int o= 9;
        
        numerosB.add(w);
        numerosB.add(z);
        numerosB.add(n);
        numerosB.add(p);
        numerosB.add(o);
        
        //eliminando eementos
        numerosB.remove(15);
        
        for(Integer num: numerosB){
            System.out.println(num);
        }
        
        //ordenando un conjunto, al tener valores hash se deben convertir a un
        //array para poder ordenarlo
        ArrayList<Integer> numerosLista = new ArrayList(numerosB);
        Collections.sort(numerosLista);
        System.out.println("");
        System.out.println("conjunto ordenado");
        for(Integer num: numerosLista){
            System.out.println(num);
        }
        
        //Ejemplo de TreeSet de numeros
        TreeSet<Integer> numeros = new TreeSet();
        
        //Ejemplo de LinkedHashSet de cadenas
        LinkedHashSet<String> frases = new LinkedHashSet();
        
        
        //Mapas
        //Ejemplo de HashMap de personas
        HashMap<Integer, String> personasA = new HashMap();
        
        //ingresando valores al Mapa
        int dni = 42759062;
        String nombreAlumno = "pepe";        
        personasA.put(dni, nombreAlumno);
        personasA.put(42821981, "Alex");
        personasA.put(12345678, "Freddy");
        personasA.put(987654321, "Olga");
        personasA.put(14785236, "Juan");
        
        //para eliminar un elemento de un Mapa, lo importante es pasar la llave
        //del elemento a eliminar
        personasA.remove(dni);
        
        //para recorrer las dos partes del Mapa se usa el OBJ Map.Entry
        //y atraves de ello traemos las llaves y los valores
        System.out.println("");
        System.out.println("Recorrer el Mapa con Map.Entry");
        for(Map.Entry<Integer, String> entry: personasA.entrySet()){
            System.out.println("documento: "+entry.getKey()+" - nombre: "+entry.getValue());
        }
        
        System.out.println("");
        System.out.println("Recorrer el Mapa sin usar Map.Entry - solo llaves");
        for(Integer dnis: personasA.keySet()){
            System.out.println("dni: "+dnis);
        }
        
        System.out.println("");
        System.out.println("Recorrer el Mapa sin usar Map.Entry - solo valores");
        for(String nombres: personasA.values()){
            System.out.println("nombres: "+nombres);
        }
        
        //para ordenar un mapa de tipo hash, lo convertimos a un mapa de tipo
        //tree, ya que los de tipo TreeMap y TreeSet se ordenan solos
        //lo ordena por medio de su llave
        System.out.println("");
        System.out.println("mapa ordenado");
        TreeMap<Integer, String> personasATree = new TreeMap(personasA);
        for(Map.Entry<Integer, String> entry: personasATree.entrySet()){
            System.out.println("dni: "+entry.getKey()+" - nombre: "+entry.getValue());
        }
        
        
        //Ejemplo de un TreeMap de personas
        TreeMap<Integer, String> personasB = new TreeMap();
        
        //Ejemplo de un LinkedHashMap de personas
        LinkedHashMap<Integer, String> personasC = new LinkedHashMap();
        
        
        
    }
    
}
