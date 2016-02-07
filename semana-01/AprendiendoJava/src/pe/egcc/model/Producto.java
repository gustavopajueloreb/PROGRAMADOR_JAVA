/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.model;

/**
 *
 * @author Alumno
 */
public class Producto {
    private String nombre; //La variable nombre es un apuntador, por que su tipo es una clase (String)
    private double precio;
    private int stock;
    private boolean activo;
    
    /**
     * Constructor por defecto
     */
    public Producto() { // escribe pro y luego ctrl + barra
        this.nombre = "Televisor de 80'";
        this.precio = 10500.0;
        this.stock = 200;
        this.activo = true;
        System.out.println("Objeto creado.");
    }

    /**
     * Constructor adicional
     * 
     * @param nombre
     * @param precio
     * @param stock
     * @param activo 
     */
    public Producto(String nombre, double precio, int stock, boolean activo) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.activo = activo;
    }
    
        /**
     * Constructor adicional
     * 
     * @param nombre
     * @param precio
     */
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = 0;
        this.activo = false;
    }
    
    @Override //sobre-escritura del destructor.
    protected void finalize() throws Throwable { //fina y ctrl + barra
        super.finalize(); 
        System.err.println("Chau objeto."); //serr y ...
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    } 
    
}
