
package com.mycompany.act5parcial1;

/**
 *@author Personal
 */
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Act5Parcial1 {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        Scanner ingreso = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Capturar datos de categoría
            System.out.print("ID de categoria: ");
            int idCategoria = ingreso.nextInt();
            ingreso.nextLine(); // Limpiar buffer
            System.out.print("Nombre de categoria: ");
            String nombreCategoria = ingreso.nextLine();
            Categoria categoria = new Categoria(idCategoria, nombreCategoria);

            // Capturar datos del producto
            System.out.print("Codigo del producto: ");
            int codigo = ingreso.nextInt();
            ingreso.nextLine();
            System.out.print("Nombre del producto: ");
            String nombre = ingreso.nextLine();
            System.out.print("Precio del producto: ");
            double precio = ingreso.nextDouble();
            ingreso.nextLine();

            // Crear y agregar producto
            Producto producto = new Producto(codigo, nombre, precio, categoria);
            productos.add(producto);

            System.out.print("¿Agregar otro producto? (si/no): ");
            continuar = ingreso.nextLine().equalsIgnoreCase("si");
        }

        // Guardar en CSV
        new FileManager().guardarEnCSV(productos, "inventario.csv");

        // Mostrar resumen
        productos.forEach(Producto::mostrarResumen);
    }
}
