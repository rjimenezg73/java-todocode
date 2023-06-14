package com.web.pruebas.jpaprueba.persistencia;

import com.web.pruebas.jpaprueba.logica.Alumno;


public class ControladoraPersistencia {
   
   AlumnoJpaController aluJpa = new AlumnoJpaController();

   public void crearAlumno(Alumno alu) {
      aluJpa.create(alu);
   }
   
}
