package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa",50);
        Producto producto2 = new Producto("Campera",100);
        Producto producto3 = new Producto("Pantalo", 100.00);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto1);
        
        orden1.mostrarOrden();
        orden1.calcularTotal();
        
    }
}
