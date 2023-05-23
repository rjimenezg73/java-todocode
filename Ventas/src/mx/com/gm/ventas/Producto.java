package mx.com.gm.ventas;

public class Producto {
   private final int idProducto;    // con final, una vez estableciso el valor de ésta propiedad ya no puede modificarse
   private String nombre;
   private double precio;
   private static int contadorProductos;

   private Producto(){
      this.idProducto = ++ Producto.contadorProductos;
   }

   public Producto(String nombre, double precio){
      this();  // Con ésta línea llamamos al constructor privado de nuestra clase, es decir al método vacío
               // inicializando de éste modo la propiedad idProducto en base a nuestra propiedad estática contadorProductos
      this.nombre = nombre;
      this.precio = precio;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public void setPrecio(double precio) {
      this.precio = precio;
   }

   public int getIdProducto() {
      return idProducto;
   }

   public String getNombre() {
      return nombre;
   }

   public double getPrecio() {
      return precio;
   }

   @Override
   public String toString() {
      return "Producto{" +
              "idProducto=" + idProducto +
              ", nombre='" + nombre + '\'' +
              ", precio=" + precio +
              '}';
   }
}
