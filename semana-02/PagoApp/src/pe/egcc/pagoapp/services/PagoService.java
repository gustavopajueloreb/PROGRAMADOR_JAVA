/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.pagoapp.services;

import pe.egcc.pagoapp.dto.PagoDto;

/**
 *
 * @author Alumno
 */
public class PagoService {
    public void procesar(PagoDto dto){
        //Variables
        double ingresos, renta, neto;
        //Proceso
        ingresos = dto.getHorasDia() 
                * dto.getDias() * dto.getPagoHora();
        if(ingresos > 1500.0){
            renta = ingresos * 0.08;
        } else {
            renta = 0.0;
        }
        neto = ingresos - renta;
        //Reporte
        dto.setIngresos(ingresos);
        dto.setRenta(renta);
        dto.setNeto(neto);
    }
}
