/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repetitivas;

import java.util.Scanner;

/**
 *
 * @author roberto
 * MATRICES
 */
public class Matrices {
  public static void main(String[] args) {
    
    // Declaración matriz
    int matriz[][] = new int[3][5];  // [Filas][Columnas]
    int matriz2[][] = new int[3][5];
    
    // Asignación manual de la matriz
    matriz[0][0] = 12;
    matriz[0][1] = 12;
    matriz[0][2] = 12;
    matriz[0][3] = 12;
    matriz[0][4] = 12;
    matriz[1][0] = 24;
    matriz[1][1] = 24;
    matriz[1][2] = 24;
    matriz[1][3] = 24;
    matriz[1][4] = 24;
    matriz[2][0] = 48;
    matriz[2][1] = 48;
    matriz[2][2] = 48;
    matriz[2][3] = 48;
    matriz[2][4] = 48;
    
    // Recorrido de la matriz
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 5; j++){
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println("");
    }
    
    // Asignacion por teclado
    System.out.println("-------------------------");
    Scanner teclado = new Scanner(System.in);
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 5; j++){
        System.out.println("Ingrese el valor a almacenar en la matriz de coordenadas " + i + ", " + j);
        matriz2[i][j] = teclado.nextInt();
      }
    }
    
    // Recorrido de la matriz2 que fue inicializada desde teclado
    System.out.println("_____________________");
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 5; j++){
        System.out.print(matriz2[i][j] + "\t");
      }
      System.out.println("");
    }
    
  }
  
}
