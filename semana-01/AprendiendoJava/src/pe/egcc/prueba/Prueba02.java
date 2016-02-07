package pe.egcc.prueba;

import pe.egcc.model.Producto;

/**
 *
 * @author Alumno
 */
public class Prueba02 {
    public static void main(String[] args) { // comando rapido psvm + tab
        Producto prod1 = new Producto(); //creando instancia, objeto.
        mostrar(prod1);
        
        prod1.setNombre("Auto 2017");
        prod1.setPrecio(25000.0);
        prod1.setStock(1);
        prod1.setActivo(false);
        mostrar(prod1);
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
