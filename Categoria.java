
package com.mycompany.act5parcial1;

/**
 *@author Personal
 */
public class Categoria {
    
    //Atributos - Encapsulamiento
    private int id;
    private String nombre;

    //constructor parametrizado
    public Categoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    //metodos getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    //metodos setters con validaciones
    public void setId(int id) {
    if (id <= 0) {
        throw new IllegalArgumentException("El ID de categoria debe ser un entero positivo ");
    }
    this.id = id;
    }

    public void setNombre(String nombre) {
    if (nombre == null || nombre.trim().isEmpty()) {
        throw new IllegalArgumentException("El nombre de categoria no puede estar vacio ");
    }
    if (nombre.trim().length() < 3) {
        throw new IllegalArgumentException("El nombre de categoria debe tener al menos 3 caracteres ");
    }
    this.nombre = nombre;
    }
}
