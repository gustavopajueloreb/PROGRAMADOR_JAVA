package pe.egcc.service;

/**
 *
 * @author GustavoCoronel
 */
public class VentaService {

  private static double IGV;
  
  static {
    IGV = 0.18;
  }
  
  public static double calcImpuesto(double importe){
    double impuesto;
    impuesto = importe * IGV;
    return impuesto;
  }
  
  
}
