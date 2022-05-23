
package HERENCIA_punto2;

public class Operario extends Empleado {    
    protected int codigo;
    
   public Operario(String nombre, int codigo){  
       super (nombre);/*EL USO DE SUPER() ES DE VOLVER A LLMAR A LA CALSE PADRE Y VOLVER A ESCRIBIR DATOS*/
       this.codigo = codigo;
       
             
   }
  
   public void mostrarDatos(){
       System.out.println("Empleado" + "-->" + "Cargo: Operario" + "-->" + "nombre: " + getNombre() + "-->"+
               "codigo: " + codigo);
   }
    
}
