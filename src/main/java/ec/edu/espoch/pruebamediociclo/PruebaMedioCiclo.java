/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.pruebamediociclo;

import ec.edu.espoch.pruebamediociclo.clases.Cliente;
import ec.edu.espoch.pruebamediociclo.clases.Pedido;
import ec.edu.espoch.pruebamediociclo.clases.Producto;
import ec.edu.espoch.pruebamediociclo.clases.Categorias;


/**
 *
 * @author Pedro
 */
public class PruebaMedioCiclo {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Pérez");
        Cliente cliente2= new Cliente("Pedro Aguilar");

        // Crear productos con sus categorías
        Producto cafe = new Producto("Café", 2.50, Categorias.ALIMENTO);
        Producto pastel = new Producto("Pastel", 3.75, Categorias.POSTRE);

        // Crear un pedido
        Pedido pedido = new Pedido();

        // Mostrar los detalles de los productos con IVA
        pedido.mostrarDetalleProducto(cafe);
        pedido.mostrarDetalleProducto(pastel);

        // Mostrar la relación entre el cliente y los productos
        pedido.mostrarClienteYProducto(cliente, cafe);
        pedido.mostrarClienteYProducto(cliente2, pastel);
    }
}
