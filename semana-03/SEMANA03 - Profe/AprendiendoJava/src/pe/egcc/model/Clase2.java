package pe.egcc.model;

/**
 *
 * @author Gustavo Coronel
 */
public class Clase2 extends Clase1{

  @Override
  public int sumar(int n1, int n2) {
    int suma;
    suma = (n1 + n2) * (n1 - n2);
    return suma;
  }
  
  
  public int restar(int n1, int n2){
    int r;
    r = n1 - n2;
    return r;
  }
  
}
