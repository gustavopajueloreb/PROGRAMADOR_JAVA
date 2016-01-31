package pe.egcc.prueba;

import pe.egcc.model.Trabajador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Trabajador trabajador;
        trabajador = new Trabajador();
        System.out.println("Salario: "+ trabajador.obtenerSalario(1));
    }
    
}
