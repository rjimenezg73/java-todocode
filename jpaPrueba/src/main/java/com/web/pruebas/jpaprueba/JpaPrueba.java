package com.web.pruebas.jpaprueba;

import com.web.pruebas.jpaprueba.logica.Alumno;
import com.web.pruebas.jpaprueba.logica.ControladoraLogica;
import com.web.pruebas.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.Date;


public class JpaPrueba {

    public static void main(String[] args) {
       //ControladoraPersistencia controlPersis = new ControladoraPersistencia(); 
       // Se comenta ya que la tabla ya la generó previamente - Estudiar modelo de capas
       
       ControladoraLogica control = new ControladoraLogica();
       Alumno alu = new Alumno(45, "Poñoño", "Mórzolota", new Date());
       control.crearAlumno(alu);
    }
}
  