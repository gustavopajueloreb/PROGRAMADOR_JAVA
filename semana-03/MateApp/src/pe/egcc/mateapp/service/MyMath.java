/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.mateapp.service;

/**
 *
 * @author Alumno
 */
public class MyMath {

    public static long factorial(int n) {
        if (n==0)
            return 1;
        else
            return n * factorial(n-1); 
    }
    
    public static int mcd(int n, int m){
        return n;  //NO
    }
    
}
