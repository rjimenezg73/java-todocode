package mx.com.gm.ventas;

import java.util.ArrayList;

public class Orden extends Producto{
   private int idOrden;
   private Producto productos[];
   private static int contadorOrdenes;
   private int contadorProductos;   // No confundir éste identificador con el usado en la clase Producto
   private static final int MAX_PRODUCTOS = 10;

   public  Orden(){
      this.idOrden = ++ Orden.contadorOrdenes;
      this.productos = new Producto[Orden.MAX_PRODUCTOS];
   }

   public void agregarProducto(Producto producto){
      if(this.contadorProductos < Orden.MAX_PRODUCTOS){
         this.productos[this.contadorProductos++] = producto;       // Post incremento en el indice
      }else{
         System.out.println("Se ha superado el máximo de productos: " + Orden.MAX_PRODUCTOS);
      }
   }

   public double calcularTotal(){
      double total = 0;
      for (int i = 0; i <  this.contadorProductos; i++) {
         Producto producto = this.productos[i];
         total += producto.getPrecio();
         // total += this.productos[i].getPrecio();   Igual a las dos líneas anteriores
      }
      return total:
   }




}
