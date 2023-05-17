/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repetitivas;

import java.util.Scanner;

/**
 *
 * @author roberto
 */
public class Repetitivas {
  public static void main(String[] args) {
    
    // Declaración de vector de 4 posiciones
    int vector[] = new int[4];
    int vector2[] = new int[4];
    
    // Asignación manual
    vector[0] = 2;
    vector[1] = 35;
    vector[2] = 48;
    vector[3] = 157;
    
    // Recorrido del vector
    for(int i = 0; i < vector.length; i++){
      System.out.println("Estoy en el índice " + i);
      System.out.println("Tengo guardado un " + vector[i]);
      System.out.println("___________________________");
    }
    
    // Asignación por teclado
    System.out.println("");
    Scanner teclado = new Scanner(System.in);
    for(int i = 0; i < vector2.length; i++){
      System.out.println("Ingrese el valor a almacenar en el índice " + i);
      vector2[i] = teclado.nextInt();
    }
    
    // Recorrido del vector2
    for(int i = 0; i < vector2.length; i++){
      System.out.println("Estoy en el índice " + i);
      System.out.println("Tengo guardado un " + vector2[i]);
      System.out.println("___________________________");
    }
    
    
  }
  
}
