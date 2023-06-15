
package app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Iteradores {

    public static void main(String[] args) {
        //Lista
        //creamos un arrayList
        ArrayList<String> lista = new ArrayList();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("Hola");
        
        //creamos el  iterador para recorrer la lista
        Iterator it = lista.iterator();
        
        System.out.println("Elementos de la Lista");
        
        //creamos un while, hasNext() retorna verdadero si al iterator quedan
        //elementos x iterar
//        while(it.hasNext()){
//            //next devuelve el elemento de la lista, sirve par mostrar el elemento
//            System.out.println(it.next());
//        }
        
        System.out.println("");
        System.out.println("Eliminando un elementos de la Lista - Hola");
        while(it.hasNext()){
            if(it.next().equals("Hola")){
                it.remove();
            }
        }
        
        for(String list: lista){
            System.out.println(list);
        }
        
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
        
        Iterator its = numerosB.iterator();
        
        System.out.println("");
//        System.out.println("Elementos del Conjunto");
//        while(its.hasNext()){
//            System.out.println(its.next());
//        }
        
        System.out.println("");
        System.out.println("Elementos del Conjunto - 3");
        
        //observar que se debe hacer comparación con OBJ
        while(its.hasNext()){
            if(its.next().equals(3)){
                its.remove();
            }
        }
        
        for(int num: numerosB){
            System.out.println(num);
        }
        
    }
    
}
