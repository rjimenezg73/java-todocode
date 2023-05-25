package mx.com.gm.test;

import mx.com.gm.ventas.Orden;
import mx.com.gm.ventas.Producto;

public class VentasTest {
   public static void main(String[] args) {
      Producto producto1 = new Producto("Camisa", 50.0);
      Producto producto2 = new Producto("Psntalón", 100.0);
      Producto producto3 = new Producto("Cinturón", 10.0);
      Producto producto4 = new Producto("Camiseta", 5.0);
      Producto producto5 = new Producto("Zapatos", 45.0);

      Orden orden1 = new Orden();
      orden1.agregarProducto(producto1);
      orden1.agregarProducto(producto2);
      orden1.agregarProducto(producto3);
      orden1.agregarProducto(producto4);
      orden1.agregarProducto(producto5);
      orden1.mostrarOrden();
   }
}
