package logica;

import java.util.Date;
import java.util.List;

public class Paciente extends Persona{
   private int id_paciente;
   private boolean tiene_ss;  // seguro social
   private String tipo_sangre;
   private Responsable unResponsable;  // Relación 1:1
   private List<Turno> listaTurnos;    // Relación 1:N

   public Paciente() {
   }

   public Paciente(int id_paciente, boolean tiene_ss, String tipo_sangre, Responsable unResponsable, List<Turno> listaTurnos, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
      super(dni, nombre, apellido, telefono, direccion, fecha_nac);
      this.id_paciente = id_paciente;
      this.tiene_ss = tiene_ss;
      this.tipo_sangre = tipo_sangre;
      this.unResponsable = unResponsable;
      this.listaTurnos = listaTurnos;
   }

   public Responsable getUnResponsable() {
      return unResponsable;
   }

   public void setUnResponsable(Responsable unResponsable) {
      this.unResponsable = unResponsable;
   }

   public List<Turno> getListaTurnos() {
      return listaTurnos;
   }

   public void setListaTurnos(List<Turno> listaTurnos) {
      this.listaTurnos = listaTurnos;
   }

  
   

   public int getId_paciente() {
      return id_paciente;
   }

   public void setId_paciente(int id_paciente) {
      this.id_paciente = id_paciente;
   }

   public boolean isTiene_ss() {
      return tiene_ss;
   }

   public void setTiene_ss(boolean tiene_ss) {
      this.tiene_ss = tiene_ss;
   }

   public String getTipo_sangre() {
      return tipo_sangre;
   }

   public void setTipo_sangre(String tipo_sangre) {
      this.tipo_sangre = tipo_sangre;
   }

   
   
   
}