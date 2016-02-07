/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.service;

/**
 *
 * @author Alumno
 */
public class MateService {
    public int sumar (int n1, int n2){
        System.out.println("Suma caso 1");
        return (n1 + n2);
    }
    
    public double sumar (double n1, int n2){
        System.out.println("Suma caso 2");
        return (n1 + n2);
    }
    
    public double sumar (int n1, double n2){
        System.out.println("Suma caso 3");
        return (n1 + n2);
    }
    
    public double sumar (double n1, double n2){
        System.out.println("Suma caso 4");
        return (n1 + n2);
    }
}
