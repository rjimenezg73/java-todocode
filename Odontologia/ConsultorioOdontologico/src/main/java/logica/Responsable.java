package logica;

import java.util.Date;


public class Responsable extends Persona{
   private int id_responsable;
   private String tipo_res;

   public Responsable() {
   }

   public Responsable(int id_responsable, String tipo_res, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
      super(dni, nombre, apellido, telefono, direccion, fecha_nac);
      this.id_responsable = id_responsable;
      this.tipo_res = tipo_res;
   }

   public int getId_responsable() {
      return id_responsable;
   }

   public void setId_responsable(int id_responsable) {
      this.id_responsable = id_responsable;
   }

   public String getTipo_res() {
      return tipo_res;
   }

   public void setTipo_res(String tipo_res) {
      this.tipo_res = tipo_res;
   }
   
   
   
}
