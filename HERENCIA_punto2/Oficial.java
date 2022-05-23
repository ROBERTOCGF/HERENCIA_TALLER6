
package HERENCIA_punto2;


public class Oficial extends Operario {
    
    public Oficial(String nombre, int codigo){
        super(nombre,codigo);
        
    }
    @Override
    public void mostrarDatos(){
       System.out.println("Empleado" + "-->" + "Cargo: Oficial" + "-->" + "nombre: " + getNombre() + "-->"+
               "codigo: " + codigo);
   }
    
}
