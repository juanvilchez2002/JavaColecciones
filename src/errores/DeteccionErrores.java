
package errores;

import java.util.HashMap;
import java.util.Map;

public class DeteccionErrores {


    public static void main(String[] args) {
        //resolviendo errores:
        //HashMap<Integer> personas = new HashMap<>;
        //String n1 = “Albus”;
        //String n2 = “Severus”;
        //personas.add(n1);
        //personas.add(n2);
        
        //solucion
        //es un mapa y debe de generarse una llave y valor, solo tiene llave
        HashMap<Integer, String> personas = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        //en un mapa se usa put y no add, aparte falta la llave        
        personas.put(1,n1);
        personas.put(2,n2);
        
        for(Map.Entry<Integer, String> entry: personas.entrySet()){
            System.out.println("Nro: "+entry.getKey()+" - nombre: "+entry.getValue());
        }
    }
    
}
