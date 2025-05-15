
package com.mycompany.act5parcial1;

/**
 *@author Personal
 */
public class Producto {
    
    //Atributo - Encapsulamiento
    private int codigo;
    private String nombre;
    private double precio;
    private Categoria categoria;
    
    //constructor parametrizado
    public Producto(int codigo, String nombre, double precio, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }
    
    //metodos getters

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    
    //metodo setters con validaciones
    public void setCodigo(int codigo) {
    if (codigo <= 0) {
        throw new IllegalArgumentException("El codigo debe ser un entero positivo.");
    }
    this.codigo = codigo;
    }

    public void setNombre(String nombre) {
    if (nombre == null || nombre.trim().isEmpty()) {
        throw new IllegalArgumentException("El nombre no puede estar vacio ");
    }
    if (nombre.trim().length() < 3) {
        throw new IllegalArgumentException("El nombre debe tener al menos 3 caracteres ");
    }
    this.nombre = nombre;
    }

    public void setPrecio(double precio) {
     if (precio <= 0) {
        throw new IllegalArgumentException("El precio debe ser mayor a cero ");
    }
    this.precio = precio;
    }

    public void setCategoria(Categoria categoria) {
    if (categoria == null) {
        throw new IllegalArgumentException("La categoria no puede ser nula ");
    }
    this.categoria = categoria;
    }
    
    //Metodo mostrar resumen del producto
    public void mostrarResumen(){
        System.out.println("--- RESUMEN DEL PRODUCTO ---");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Categoria: " + getCategoria());
    }

}
