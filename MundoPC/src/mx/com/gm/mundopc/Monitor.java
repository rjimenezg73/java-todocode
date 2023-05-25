package mx.com.gm.mundopc;


public class Monitor {
   private final int idMonitor;
   private String marca;
   private String tamanio;
   private static int contadorMonitores;
   
   private Monitor(){
      this.idMonitor = ++Monitor.contadorMonitores;
   }
   
   public Monitor(String marca, String tamanio){
      this(); // Para llamar el constructor vacio que es privado
      this.marca = marca;
      this.tamanio = tamanio;
   }

   public int getMonitor(){
      return this.idMonitor;
   }
   public String getMarca() {
      return this.marca;
   }

   public void setMarca(String marca) {
      this.marca = marca;
   }

   public String getTamanio() {
      return this.tamanio;
   }

   public void setTamanio(String tamanio) {
      this.tamanio = tamanio;
   }

   @Override
   public String toString() {
      return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
   }
   
   
   
}
