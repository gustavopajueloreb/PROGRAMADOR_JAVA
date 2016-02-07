package pe.egcc.prueba;

import pe.egcc.model.Producto;

/**
 *
 * @author Alumno
 */
public class Prueba05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto prod1 = new Producto();
        
        Producto prod2 = new Producto("Televisor", 3678.90);
        
        Producto prod3 = new Producto("Radio", 3678.90, 50, true);
        
        mostrar(prod1);
        mostrar(prod2);
        mostrar(prod3);
    }
    
    private static void mostrar(Producto p) {
        System.out.println("--------");
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Precio: " + p.getPrecio());
        System.out.println("Stock: " + p.getStock());
        System.out.println("Activo: " + p.isActivo()); 
        //System.out.println(n); // A nivel de metodo las variables deben ser incializadas antes de ser usadas.
    }
    
}
