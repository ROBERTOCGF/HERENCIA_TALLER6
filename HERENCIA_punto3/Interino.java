
package HERENCIA_punto3;



public class Interino extends Profesor {
    public String remplazo;

    public Interino(String nombre, String apellido, String telefono, int edad, String clase, int salario, String remplazo) {
        super(nombre, apellido, telefono, edad, clase, salario);
        this.remplazo = remplazo;
    }
    @Override
    public void mostrar(){
        System.out.println("Nombre: " + getNombre() + "\nApellido: " + getApellido() + "Tlefono: " + getTelefono() + 
                "\nEdad: " + getEdad() + "\nClase: " + getClase() + "\nSalario: " + getSalario() + "\nRemplazo: " + remplazo);
    }




  
}
