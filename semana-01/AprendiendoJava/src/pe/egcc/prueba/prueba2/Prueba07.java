package pe.egcc.prueba.prueba2;

import pe.egcc.model2.*;

/**
 *
 * @author Alumno
 */
public class Prueba07 {
    public static void main(String[] args) {
        Clase2 obj = new Clase2();
        
        System.out.println("Clase 4: "+((obj instanceof Clase4)?"SI":"NO"));
        System.out.println("Clase 3: "+((obj instanceof Clase3)?"SI":"NO"));
        System.out.println("Clase 2: "+((obj instanceof Clase2)?"SI":"NO"));
        System.out.println("Clase 1: "+((obj instanceof Clase1)?"SI":"NO"));
        System.out.println("Object: "+((obj instanceof Object)?"SI":"NO"));
    }
}
