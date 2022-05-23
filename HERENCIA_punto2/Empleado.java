
package HERENCIA_punto2;

public class Empleado {
    String nombre;
    
    

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void mostrar(){
        System.out.println("Empleado" + "-->" + "Nombre: "+nombre);
    }
    
   

    
}   
 
