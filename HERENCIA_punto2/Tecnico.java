
package HERENCIA_punto2;


public class Tecnico extends Operario{
    
    public Tecnico(String nombre, int codigo){
        super(nombre,codigo);
        
    }
    @Override /*SE USA EL @OVERRIDE PARA SOBRE ESCRIBIR LOS DATOS DEL METODO QUE SE USA */
    public void mostrarDatos(){
       System.out.println("Empleado" + "-->" + "Cargo: Oficial" + "-->" + "nombre: " + getNombre() + "-->"+
               "codigo: " + codigo);
   }
    
}
