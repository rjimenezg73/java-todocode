package mundopc;

import mx.com.gm.mundopc.*;


public class MundoPC {
   public static void main(String[] args) {
      Monitor monitorHP = new Monitor("HP","13");
      KeyBoard tecladoHP = new KeyBoard("Bluetooth", "HP");
      Mouse mouseHP = new Mouse("Bluetooth", "HP");
      Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, mouseHP);
      
      Monitor monitorGamer = new Monitor("Gamer", "24");
      KeyBoard tecladoGamer = new KeyBoard("Inalambrico", "Gamer");
      Mouse mouseGamer = new Mouse("Bluetooth", "Gamer");
      Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, mouseGamer);
      
      Orden orden1 = new Orden();
      orden1.agregarComputadora(computadoraHP);
      orden1.agregarComputadora(computadoraGamer);
      
      orden1.mostrarOrden();
   }
}
