/**
 * LinkedList - Características
 *
 * Es una clase
 * Representa una lista doblemente enlazada ( ida y vuelta)
 * Permite duplicados
 * Mantiene el orden de inserción
 * Manipulación más rápida
 * Puede se usada o tratada no solo como lista, sino también como pila o como cola
 * Permite hacer inserciones o eliminaciones al principio o al final de la colección
 */
package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {
  public static void main(String[] args) {

    List<Persona> lista = new LinkedList<Persona>();
    lista.add(new Persona(1, "Roberto", 50));

    // Otra manera de agregar registros
    Persona persona2 = new Persona(2, "Gabriela",43);
    lista.add(persona2);


    lista.add(new Persona(3, "Coconito", 12));
    lista.add(new Persona(4, "Peter Pan", 54));
    lista.add(new Persona(5, "Pica Cu", 52));



    // Recorrer con foreach, es casi forzoso ya que las linkedlist no tienen un índice bien definido como
    // lo tienen los arraylist
    for (Persona people: lista) {
      System.out.println(people);
    }

    System.out.println("---------------------");
    // Al ser doblemente enlazada puedo agregar un elemento al principio si así lo deseo
    lista.add(0,new Persona(6, "Piolin", 23));

    for (Persona people: lista) {
      System.out.println(people);
    }


  }
}
