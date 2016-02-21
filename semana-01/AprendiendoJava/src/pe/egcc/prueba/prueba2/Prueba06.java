/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.prueba.prueba2;

import pe.egcc.model2.*;

/**
 *
 * @author Alumno
 */
public class Prueba06 {
    public static void main(String[] args) {
        Clase4 bean = new Clase4();
        //System.out.println("7 + 4 = " + bean.sumar(7, 4));
        Clase4 a = new Clase4(); //acceso a sumar y restar
        Clase2 b = a; //acceso a sumar y restar
        Clase1 c = a; //acceso a sumar
        Object d = a; //acceso a nada
        //Clase3 e = a; LOL
        
        System.out.println("7 + 5 = " + a.sumar(7, 5)); //METODO DE LA CLASE2
        System.out.println("7 + 5 = " + b.sumar(7, 5)); //METODO DE LA CLASE2
        System.out.println("7 + 5 = " + c.sumar(7, 5)); //METODO DE LA CLASE2
    }
}
