
package HERENCIA_punto2;


public class TALLER6 {

 
    public static void main(String[] args) {
       Empleado E1 = new Empleado("Rafa");
       Directivo D1 = new Directivo("Mario", 23);
       Operario OP1 = new Operario("Alfonso", 45);
       Oficial OF1 = new Oficial("luis",56);
       Tecnico T1 = new Tecnico ("pablo",80);
       
       E1.mostrar();
       D1.mostrarDatos();
       OP1.mostrarDatos();
       OF1.mostrarDatos();
       T1.mostrarDatos();
    }
    
}
