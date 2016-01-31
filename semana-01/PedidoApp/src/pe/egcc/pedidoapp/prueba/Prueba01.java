package pe.egcc.pedidoapp.prueba;

import pe.egcc.pedidoapp.service.PedidoService;

/**
 *
 * @author Alumno
 */
public class Prueba01 {
    public static void main(String[] args) { // comando rapido psvm + tab
        PedidoService service;
        service = new PedidoService();
        double importe = 8945.70;
        System.out.println("Importe: " + importe);
        System.out.println("Impuesto: " + service.calcularImpuesto(importe));
        System.out.println("Total: " + service.calcularTotal(importe));
    }
}
