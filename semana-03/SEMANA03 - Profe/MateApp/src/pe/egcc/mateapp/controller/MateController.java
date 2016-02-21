package pe.egcc.mateapp.controller;

import pe.egcc.mateapp.service.MyMath;

/**
 *
 * @author GustavoCoronel
 */
public class MateController {
  
  public long factorial(int n){
    return MyMath.factorial(n);
  }
  
}
