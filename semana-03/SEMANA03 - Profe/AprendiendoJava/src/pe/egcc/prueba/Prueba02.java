package pe.egcc.prueba;

import pe.egcc.service.VentaService;
import sun.applet.Main;

/**
 *
 * @author GustavoCoronel
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    double impuesto;
    impuesto = VentaService.calcImpuesto(4000.0);
    System.out.println("Impuesto: " + impuesto);
  }
}
