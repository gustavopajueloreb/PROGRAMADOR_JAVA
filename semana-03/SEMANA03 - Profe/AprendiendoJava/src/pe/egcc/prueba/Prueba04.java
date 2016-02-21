package pe.egcc.prueba;

import pe.egcc.model.Clase1;
import pe.egcc.model.Clase2;
import pe.egcc.model.Clase3;
import pe.egcc.model.Clase4;

/**
 *
 * @author GustavoCoronel
 */
public class Prueba04 {

  public static void main(String[] args) {
    Clase4 a = new Clase4();
    Clase2 b = a;
    Clase1 c = a;
    Object d = a;
  
    
    System.out.println("5 + 4 = " + a.sumar(5, 4));
    System.out.println("5 + 4 = " + c.sumar(5, 4));
  }
  
}
