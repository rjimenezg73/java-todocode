package com.web.pruebas.jpaprueba.logica;

import com.web.pruebas.jpaprueba.persistencia.ControladoraPersistencia;


public class ControladoraLogica {
   
   // Todos los métodos a utilizar
   
   ControladoraPersistencia controlPersis = new ControladoraPersistencia();
   
   public void crearAlumno(Alumno alu){
      controlPersis.crearAlumno(alu);
   }
   
}
