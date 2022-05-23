
package HERENCIA_punto3;




public class Profesor extends Persona{
    private String clase;
    private int salario;

    public Profesor(String nombre, String apellido, String telefono, int edad, String clase, int salario) {
        super(nombre, apellido, telefono, edad);
        this.clase = clase;
        this.salario = salario;
    }
    
    public void mostrar(){
        System.out.println("Nombre: " + getNombre() + "\nApellido: " + getApellido() + "Tlefono: " + getTelefono() + 
                "\nEdad: " + getEdad() + "\nClase: " + clase + "\nSalario: " + salario );
    }
    
    
    
   

    
     
    
     
}
