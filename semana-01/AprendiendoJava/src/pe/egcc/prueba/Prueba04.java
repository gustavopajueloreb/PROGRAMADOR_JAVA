package pe.egcc.prueba;

import pe.egcc.service.MateService;

/**
 *
 * @author Alumno
 */
public class Prueba04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MateService service = new MateService();
        System.out.println("7 + 8 = " + service.sumar(7, 8));
        System.out.println("7.0 + 8 = " + service.sumar(7.0, 8));
        System.out.println("7 + 8.0 = " + service.sumar(7, 8.0));
        System.out.println("7.0 + 8.0 = " + service.sumar(7.0, 8.0));
    }
    
}
