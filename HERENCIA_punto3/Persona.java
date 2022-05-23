
package HERENCIA_punto3;


public class Persona {
    private String nombre;
    private String apellido;
    private String telefono;
    private int edad;

    public Persona(String nombre, String apellido, String telefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
    }
    


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
   
    
    
}
