/*CLASE HIJA*/
package HERENCIA_punto2;

public class Directivo extends Empleado{ /*LLAMAMOS A AL CONSTRUCTOR EMPLEADO*/  
   private int codigo;
    
   public Directivo(String nombre, int codigo){  
       super (nombre);
       this.codigo = codigo;       
             
   }
  
   public void mostrarDatos(){
       System.out.println("Empleado" + "-->" + "Cargo: Directivo" + "-->" + "nombre: " + getNombre() + "-->"+
               "codigo: " + codigo);
   }

    
}
