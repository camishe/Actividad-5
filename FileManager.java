package com.mycompany.act5parcial1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileManager {

    public void guardarEnCSV(List<Producto> productos, String rutaArchivo) {
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            // Escribir encabezado
            writer.append("Codigo,Nombre,Precio,ID_Categoria,Categoria\n");

            // Escribir datos
            for (Producto producto : productos) {
                writer.append(String.valueOf(producto.getCodigo())).append(",");
                writer.append(escapeCSV(producto.getNombre())).append(",");
                writer.append(String.valueOf(producto.getPrecio())).append(",");
                writer.append(String.valueOf(producto.getCategoria().getId())).append(",");
                writer.append(escapeCSV(producto.getCategoria().getNombre()));
                writer.append("\n");
            }

            System.out.println("Archivo CSV guardado en: " + rutaArchivo);

        } catch (IOException e) {
            System.err.println("Error al guardar CSV: " + e.getMessage());
        }
    }

    private String escapeCSV(String input) {
        if (input == null) return "";
        if (input.contains(",") || input.contains("\"")) {
            return "\"" + input.replace("\"", "\"\"") + "\"";
        }
        return input;
    }
}
