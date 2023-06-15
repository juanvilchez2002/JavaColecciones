
package entidades;

public class Alumno {
    
    //definiendo atritos
    private String nombre;
    private String apodo;

    public Alumno() {
    }

    public Alumno(String nombre, String apodo) {
        this.nombre = nombre;
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apodo=" + apodo + '}';
    }    
}
