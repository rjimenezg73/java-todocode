package mx.com.gm.mundopc;

public class Computadora {
   private final int idComputadora;
   private String nombre;
   private Monitor monitor;
   private KeyBoard keyboard;
   private Mouse mouse;
   private static int contadorComputadoras;
   
   private Computadora(){
      this.idComputadora = ++Computadora.contadorComputadoras;
   }
   
   public Computadora(String nombre, Monitor monitor, KeyBoard keyboard, Mouse mouse){
      this();
      this.nombre = nombre;
      this.monitor = monitor;
      this.keyboard = keyboard;
      this.mouse = mouse;
   }

   public int getIdComputadora() {
      return this.idComputadora;
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public Monitor getMonitor() {
      return this.monitor;
   }

   public void setMonitor(Monitor monitor) {
      this.monitor = monitor;
   }

   public KeyBoard getKeyboard() {
      return this.keyboard;
   }

   public void setKeyboard(KeyBoard keyboard) {
      this.keyboard = keyboard;
   }

   public Mouse getMouse() {
      return this.mouse;
   }

   public void setMouse(Mouse mouse) {
      this.mouse = mouse;
   }

   @Override
   public String toString() {
      return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", keyboard=" + keyboard + ", mouse=" + mouse + '}';
   }
   
   
   
}
