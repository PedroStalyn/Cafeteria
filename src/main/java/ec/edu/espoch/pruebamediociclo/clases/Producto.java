
package ec.edu.espoch.pruebamediociclo.clases;

public class Producto {
    private String nombre;
    private double precio;
    private Categorias categoria;

    public Producto(String nombre, double precio, Categorias categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public Categorias getCategoria() {
        return categoria;
    }
}
