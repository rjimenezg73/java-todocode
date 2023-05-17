/*
 * EJERCICIO INTEGRADOR DE CONDICIONALES
 * Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos
 * de los mismos pueden tener 3 categorías:
 * 1. Repositor
 * 2. Cajero
 * 3. Supervisor
 * Los Repositores cobran $15,890 + un bono del 10%
 * Los Cajeros cobran $25,630.89 fijos
 * Los Supervisores cobran $35,560.20 en bruto al cual se les descuenta un 11% de jubilacion
 * Se necesita un programa que, dependiendo del tipo de empleado del que se trate,
 * calcule y muestre en pantalla el correspondiente sueldo 
 */
package condicionalesintegrador;

/**
 *
 * @author roberto
 */
public class CondicionalesIntegrador {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    int tipoEmp = 1;    // 1. Repositor, 2. Cajero, 3. Supervisor
    double sueldo = 0.0;
    double s1 = 15890.0;
    double s2 = 25630.89;
    double s3 = 35560.20;
    
    switch(tipoEmp){
      case 1: sueldo = s1 + (s1 * 0.10);
        break;
      case 2: sueldo = s2;
        break;
      case 3: sueldo = s3 - (s3 * 0.11);
        break;
      default: System.out.println("Este tipo de empleado no existe");
    }
    System.out.println("El sueldo para éste empleado es de: $ " + sueldo);
  }
  
}
