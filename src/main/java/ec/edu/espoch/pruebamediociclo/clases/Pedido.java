
package ec.edu.espoch.pruebamediociclo.clases;

public class Pedido {
    private static final double IVA = 0.12; // IVA del 12%

    public void mostrarDetalleProducto(Producto producto) {
        double precioConIva = producto.getPrecio() + (producto.getPrecio() * IVA);
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Categoría: " + producto.getCategoria());
        System.out.println("Precio (sin IVA): $" + producto.getPrecio());
        System.out.println("Precio (con IVA): $" + precioConIva);
    }

    public void mostrarClienteYProducto(Cliente cliente, Producto producto) {
        double precioConIva = producto.getPrecio() + (producto.getPrecio() * IVA);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Producto comprado: " + producto.getNombre());
        System.out.println("Categoría: " + producto.getCategoria());
        System.out.println("Precio (sin IVA): $" + producto.getPrecio());
        System.out.println("Precio (con IVA): $" + precioConIva);
    }
}