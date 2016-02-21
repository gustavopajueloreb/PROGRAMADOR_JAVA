package pe.egcc.model2;

/**
 *
 * @author Alumno
 */
public class Clase2 extends Clase1{
    
    //Sobreescritura
    @Override
    public int sumar(int n1, int n2) {
        int suma;
        suma = (n1 + n2) * (n1- n2);
        return suma;
    }
    
    public int restar(int n1, int n2){
        int r;
        r = n1 - n2;
        return r;
    }
    
}
