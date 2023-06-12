package logica;

import java.util.List;


public class Odontologo extends Persona{
   private int id_odontologo;
   private String especialidad;
   private List<Turno> listaTurnos;
   private Usuario unUsuario;
   private Horario unHorario;

   public Odontologo() {
   }

   public int getId_odontologo() {
      return id_odontologo;
   }

   public void setId_odontologo(int id_odontologo) {
      this.id_odontologo = id_odontologo;
   }

   public String getEspecialidad() {
      return especialidad;
   }

   public void setEspecialidad(String especialidad) {
      this.especialidad = especialidad;
   }

   public List<Turno> getListaTurnos() {
      return listaTurnos;
   }

   public void setListaTurnos(List<Turno> listaTurnos) {
      this.listaTurnos = listaTurnos;
   }

   public Usuario getUnUsuario() {
      return unUsuario;
   }

   public void setUnUsuario(Usuario unUsuario) {
      this.unUsuario = unUsuario;
   }

   public Horario getUnHorario() {
      return unHorario;
   }

   public void setUnHorario(Horario unHorario) {
      this.unHorario = unHorario;
   }
   
   
}
