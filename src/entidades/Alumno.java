
package entidades;

public class Alumno {
    
    //definiendo atritos
    //private Integer dni;
    private String nombre;
    private String apodo;

    public Alumno() {
    }

    public Alumno(String nombre, String apodo) {
        this.nombre = nombre;
        this.apodo = apodo;
    }

//    public Alumno(String nombre, String apodo, Integer dni) {
//        this.nombre = nombre;
//        this.apodo = apodo;
//        this.dni = dni;
//    }

//    public Integer getDni() {
//        return dni;
//    }

//    public void setDni(Integer dni) {
//        this.dni = dni;
//    }
//
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    
}
