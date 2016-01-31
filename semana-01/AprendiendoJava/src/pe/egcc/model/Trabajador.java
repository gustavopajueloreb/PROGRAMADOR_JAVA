/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.model;

/**
 *Esta clase da servicios referidos al trabajador (DOCUMENTACION JAVA DOC)
 * 
 * @author Alumno
 */
public class Trabajador {
    /**
     *Este metodo retorna el salario de un trabajdor segun su categoría.
     * 
     * @param categoria Categoría del trabajador.
     * @return Retorna el salario en funcion de su categoría
     */
    public double obtenerSalario (int categoria) {
        double salario = 0.0;
        switch(categoria){
            case 1:
                salario = 1500.0;
                break;
            case 2:
                salario = 3500.0;
                break;
            case 3:
                salario = 6500.0;
                break;
               
        }
        return salario;
    }
}
