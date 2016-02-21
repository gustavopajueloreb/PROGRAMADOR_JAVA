package pe.egcc.prueba;

import pe.egcc.model.Clase1;
import pe.egcc.model.Clase2;
import pe.egcc.model.Clase3;
import pe.egcc.model.Clase4;

/**
 *
 * @author GustavoCoronel
 */
public class Prueba05 {
  
  public static void main(String[] args) {
    Clase2 obj = new Clase2();
    
    System.out.println("Clase 4: " + ((obj instanceof Clase4)?"SI":"NO"));
    System.out.println("Clase 3: " + ((obj instanceof Clase3)?"SI":"NO"));
    System.out.println("Clase 2: " + ((obj instanceof Clase2)?"SI":"NO"));
    System.out.println("Clase 1: " + ((obj instanceof Clase1)?"SI":"NO"));
    System.out.println("Object: " + ((obj instanceof Object)?"SI":"NO"));
  
  }
  
  
  
}
